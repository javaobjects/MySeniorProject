package com.neuedu.chapter01.String类;

public class StringBufferDemo {

	public static void main(String[] args) {
		/**
		 * 1.创建对象
		 */
		//构造一个其中不带字符的字符串缓冲区，初始容量为 16 个字符
		StringBuffer sb = new StringBuffer();
		
		//构造一个不带字符，但具有指定初始容量的字符串缓冲区
		StringBuffer sb2 = new StringBuffer(70);
		
		// 构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容
		StringBuffer sb3 = new StringBuffer("abc");
		
		/**
		 * 2.常用方法
		 */
		//capacity() 查看字符串缓冲区的容量
		System.out.println("容量：" + sb.capacity());//16
		System.out.println("容量：" + sb2.capacity());//70
		System.out.println("容量：" + sb3.capacity());//19
		
		//append() 追加字符串
		//sb = sb + "123" + "true";//String类型字符串拼接方式
		sb.append("123").append(true).append("中文");
		System.out.println(sb);//123true中文
		
		String str = "----"; //不可变
		str.concat("123").concat("true").concat("中文");
		System.out.println(str);//----
		
		//delete(start,end) 删除指定区间的字符，不包括结束位置
		sb.delete(3, 7);
		System.out.println(sb);//123中文
		
		//deleteCharAt(index) 删除指定下标位置的字符
		sb.deleteCharAt(2);
		System.out.println(sb);//12中文
		
		//insert(offset,element) 在指定位置新增一个元素
		sb.insert(0, "新增");
		System.out.println(sb);//新增12中文
		
		//replace(start,end,string) 用指定string替换start~end区间的值
		sb.replace(0, 2, "add");
		System.out.println(sb);//add12中文
		
		StringBuffer tele = new StringBuffer("13312347890");
		tele.replace(3, 7, "****");
		System.out.println(tele);
		
		//reverse() 颠倒字符串
		//sb.reverse();
		//System.out.println(sb);//文中21dda
		
		//setCharAt(index,char) 将index位置的字符替换为char 
		sb.setCharAt(0, 'o');
		System.out.println(sb);//odd12中文
		
		//toString() StringBuffer -> String
		System.out.println(sb.toString());
		
		/**
		 * 想要判断两个StringBuffer变量的内容是否相等，应先用toString（）将他们转换成String对象
		 */
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = new StringBuffer("abc");
		
		System.out.println(sb4 == sb5);     //false 比较地址值
		System.out.println(sb4.equals(sb5));//false 没有重写Object的equals，所以默认还是比较地址值
		
		//StringBuffer -> String之后再比较
		String str4 = sb4.toString();
		String str5 = sb5.toString();
		
		System.out.println(str4 == str5);    //false 比较地址值
		System.out.println(str4.equals(str5));//true 先比较地址值，再比较字面值
		
		/**
		 * String与StringBuffer的区别：
		 * 		相同点：
		 * 			1.都是表示字符序列
		 *          2.都属于java.lang包中的类，不需要导入包
		 * 
		 * 	           不同点：
		 * 			1.String是不可变的字符序列
		 * 			2.StringBuffer是可变字符序列
		 * 			3.StringBuffer节省内存开销
		 */
		String str6 = "abc";
		str6 = str6 + "123";//abc123
		str6 = str6 + "true";//abc123true
		
		//abc  abc123  abc123true
		
		StringBuffer sb6 = new StringBuffer("abc");
		sb6.append("123");//abc123
		sb6.append("true");//abc123true
		
		//abc123true
	}
}
