package com.neuedu.chapter01.String类;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/**
		 * 1.创建对象（构造函数）
		 */
		/**静态方式（常用）*/
		String str = "abc中文";
		
		/**动态方式*/
		//① 初始化一个新创建的 String 对象，使其表示一个空字符序列
		String str2 = new String();
		
		//②  初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列
		String str3 = new String("abc");
		
		//③ 分配一个新的字符串，它包含字符串缓冲区参数中当前包含的字符序列
		StringBuffer sb = new StringBuffer("abc");
		String str4 = new String(sb);
		
		//④.① 编码（字符串 ->字节数组） ： 使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组
		//    常用字符集编码格式： GBK（中文）  GB2312（中文）  UTF-8（通用）  ISO-8859-1（西欧语言）
		byte[] bytes = str.getBytes("GBK");
		
		//④.② 解码（字节数组 -> 字符串）：通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String
		String str5 = new String(bytes, "GBK");
		System.out.println(str5);
		
		/**
		 * 2.常用方法
		 */
		String str6 = "abc";//"abc"保存在【常量池】中
		String str7 = "abc";//"abc"保存在【常量池】中
		
		String str8 = new String("abc");//"abc"保存在【堆内存】中
		String str9 = new String("abc");//"abc"保存在【堆内存】中  
		
		System.out.println(str6 == str7);     //true 比较地址值
		System.out.println(str6.equals(str7));//true
		
		System.out.println(str8 == str9);     //false 比较地址值
		System.out.println(str8.equals(str9));//true
		
		System.out.println(str6 == str8);    //false 比较地址值
		System.out.println(str6.equals(str8));//true
		/**
		 *  ==： 比较String类型的地址值
		 *  
		 *  equals（已经重写父类Object的equals）的比较机制 ：
		 *  	1.先比较引用地址：如果相等，返回true，如果不等，继续判断字面值
		 *      2.比较字面值：如果字面值相等，返回true，如果不等，再返回false
		 */
		
		/**
		 * 连接操作符"+"
		 */
		System.out.println(10 + 20 + 'a');//127   a->97  byte、short、char默认转换为int类型再计算
		System.out.println(10 + 20 + "a");//30a
		System.out.println('a' + 10 + 20);//127
		
		/**
		 * String  char[]  byte[] 三者之间的转换
		 */
		String str10 = "123abc中文";// 英文与数字各占1个字节      GBK编码下中文占2个字节
		
		//getBytes() 字符串 -> 字节数组
		byte[] bytes2 = str10.getBytes();
		System.out.println(Arrays.toString(bytes2));//[49, 50, 51, 97, 98, 99, -42, -48, -50, -60]
		
		//toCharArray() 字符串 -> 字符数组
		char[] chars = str10.toCharArray();
		System.out.println(Arrays.toString(chars));//[1, 2, 3, a, b, c, 中, 文]
		
		//字节数组 -> 字符串
		String str11 = new String(bytes2);
		
		//字符数组-> 字符串
		String str12 = new String(chars);
		
		/**
		 * 其他常用方法
		 */
		//charAt(index)返回指定index位置的字符
		String str13 = "zhaorong@neusoft.com";
		System.out.println(str13.charAt(8));//@
		
		//concat() 拼接字符串
		String str14 = "abc";
		
		str14 = str14 + "123" + "中文"; 
		str14 = str14.concat("123").concat("中文");
		
		//contains() 判断字符串是否包含指定的值---类似于oracle的like
		System.out.println(str13.contains("@"));//true
		
		//endWith() 判断以....结尾
		String fileName = "caixukun.jpg";
		System.out.println(fileName.endsWith(".jpg"));//true
		System.out.println(fileName.endsWith(".gif"));//false
		
		//startWith() 判断以....开头
		String username = "黎杰成";
		System.out.println(username.startsWith("黎"));//true
		System.out.println(username.startsWith("李"));//false
		
		//equals() 判断两个字符串是否相等，区分大小写
		String code = "Ea8K"; //界面上的验证码
		String userCode = "ea8k"; //用户输入的验证码
		System.out.println(code.equals(userCode));//false
		
		//equalsIgnoreCase() 判断两个字符串是否相等，忽略大小写
		System.out.println(code.equalsIgnoreCase(userCode));//true
		
		//toLowerCase() 转小写
		System.out.println(userCode.toLowerCase());//ea8k
		
		//toUpperCase() 转大写
		System.out.println(userCode.toUpperCase());//EA8K
		
		//indexOf(char) 查找指定下标的字符-------从左往右查找第一个出现的字符，如果不存在，返回-1
		String str15 = "zhaorong@neusoft.com";
		System.out.println(str15.indexOf('@'));//8
		
		//lastIndexOf(char) 查找指定下标的字符-------从右往左查找第一个出现的字符，如果不存在，返回-1
		System.out.println(str15.lastIndexOf('.'));//16
		
		/**
		 * 校验一个邮箱是否合法：
		 * 		1.必须包含@符号
		 * 		2.必须包含.符号
		 * 		3.@符号必须在.符号前面
		 * 		4.只允许出现一个@符号
		 */
		int atIndex = str15.indexOf('@');
		int dotIndex = str15.lastIndexOf('.');
		int atLastIndex = str15.lastIndexOf('@');
		
		if(atIndex >= 0 && dotIndex >= 0 && atIndex < dotIndex && atIndex == atLastIndex)
		{
			System.out.println("邮箱合法");
		}
		else
		{
			System.out.println("邮箱不合法，请参考以下格式xxxxx@xxxx.xxx");
		}
		
		//isEmpty() 判断字符串是否为空（即长度是否>0）
		String str16 = null;
		//System.out.println(str16.isEmpty());//NullPointerException空指针异常
		
		String str17 = "";
		System.out.println(str17.isEmpty());//true
		
		String str18 = " ";
		System.out.println(str18.isEmpty());//false
		
		//length() 判断字符串的长度
		//System.out.println(str16.length());//NullPointerException空指针异常
		System.out.println(str17.length());//0
		System.out.println(str18.length());//1
		
		if(str16 != null && !"".equals(str16))
		{
			System.out.println("str16不为空");
		}
		else
		{
			System.out.println("str16为空");
		}
		
		//substring(beginIndex) 截取字符串 ，默认从beginIndex位置截取到末尾
		String str19 = "zhaorong@neusoft.com";
		System.out.println(str19.substring(8));//@neusoft.com
		System.out.println(str19.substring(str19.indexOf('@')));//@neusoft.com
		
		//substring(beginIndex,endIndex)截取字符串 ，默认从beginIndex位置截取到endIndex，不包括结束位置
		System.out.println(str19.substring(0,8));//zhaorong
		System.out.println(str19.substring(0,str19.indexOf('@')));//zhaorong
		
		//trim()  去首尾空格
		String str20 = " zhao rong ";
		System.out.println(str20);       //" zhao rong "
		System.out.println(str20.trim());//"zhao rong"
		
		//replace(oldChar,newChar) 替换字符串
		System.out.println(str20.replace(" ", "")); //"zhaorong"
		
		String str21 = "发表香港言论，涉及废青，涉及政治问题，涉及习大大的举措";
		System.out.println(str21.replace("废青", "**").replace("政治", "**"));
		
		/**
		 * 使用正则表达式的方法：
		 *     [0-9] : 表示0-9之间的任意一个数字， \d
		 *     [a-zA-Z] : 表达26个大小写字母的任意一个字符
		 *     [a-zA-Z_0-9] ： \w
		 *     
		 *     
		 * 	         邮箱：[0-9]{6} 或者   \d{6}
		 *     手机号码：[1]{1}[3|4|5|7|8|9]{1}[0-9]{9}
		 *     邮箱：[a-zA-Z_0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}
		 */
		//matches() 使用正则表达式校验字符串是否符合指定规则
		String postCode = "510663";
		String postCodeRegex = "^[0-9]{6}$"; //[0-9]{6}  \d{6}
		System.out.println(postCode.matches(postCodeRegex));
		
		String email = "zhaorong@neusoft.com";
		String emailRegex = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}";
		System.out.println(email.matches(emailRegex));
		
		//replaceAll() 使用正则表达式替换所有字符
		String str22 = "i4like5you6hahaha";
		System.out.println(str22.replaceAll("[0-9]", " "));
		
		//split() 分割字符串
		String str23 = "锦权;18;男;110";
		String[] array = str23.split(";");
		for (String str24 : array) {
			System.out.println(str24);
		}
	}
}
