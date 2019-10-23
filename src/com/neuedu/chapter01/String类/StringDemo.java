package com.neuedu.chapter01.String��;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/**
		 * 1.�������󣨹��캯����
		 */
		/**��̬��ʽ�����ã�*/
		String str = "abc����";
		
		/**��̬��ʽ*/
		//�� ��ʼ��һ���´����� String ����ʹ���ʾһ�����ַ�����
		String str2 = new String();
		
		//��  ��ʼ��һ���´����� String ����ʹ���ʾһ���������ͬ���ַ�����
		String str3 = new String("abc");
		
		//�� ����һ���µ��ַ������������ַ��������������е�ǰ�������ַ�����
		StringBuffer sb = new StringBuffer("abc");
		String str4 = new String(sb);
		
		//��.�� ���루�ַ��� ->�ֽ����飩 �� ʹ�ø����� charset ���� String ���뵽 byte ���У���������洢���µ� byte ����
		//    �����ַ��������ʽ�� GBK�����ģ�  GB2312�����ģ�  UTF-8��ͨ�ã�  ISO-8859-1����ŷ���ԣ�
		byte[] bytes = str.getBytes("GBK");
		
		//��.�� ���루�ֽ����� -> �ַ�������ͨ��ʹ��ָ���� charset ����ָ���� byte ���飬����һ���µ� String
		String str5 = new String(bytes, "GBK");
		System.out.println(str5);
		
		/**
		 * 2.���÷���
		 */
		String str6 = "abc";//"abc"�����ڡ������ء���
		String str7 = "abc";//"abc"�����ڡ������ء���
		
		String str8 = new String("abc");//"abc"�����ڡ����ڴ桿��
		String str9 = new String("abc");//"abc"�����ڡ����ڴ桿��  
		
		System.out.println(str6 == str7);     //true �Ƚϵ�ֵַ
		System.out.println(str6.equals(str7));//true
		
		System.out.println(str8 == str9);     //false �Ƚϵ�ֵַ
		System.out.println(str8.equals(str9));//true
		
		System.out.println(str6 == str8);    //false �Ƚϵ�ֵַ
		System.out.println(str6.equals(str8));//true
		/**
		 *  ==�� �Ƚ�String���͵ĵ�ֵַ
		 *  
		 *  equals���Ѿ���д����Object��equals���ıȽϻ��� ��
		 *  	1.�ȱȽ����õ�ַ�������ȣ�����true��������ȣ������ж�����ֵ
		 *      2.�Ƚ�����ֵ���������ֵ��ȣ�����true��������ȣ��ٷ���false
		 */
		
		/**
		 * ���Ӳ�����"+"
		 */
		System.out.println(10 + 20 + 'a');//127   a->97  byte��short��charĬ��ת��Ϊint�����ټ���
		System.out.println(10 + 20 + "a");//30a
		System.out.println('a' + 10 + 20);//127
		
		/**
		 * String  char[]  byte[] ����֮���ת��
		 */
		String str10 = "123abc����";// Ӣ�������ָ�ռ1���ֽ�      GBK����������ռ2���ֽ�
		
		//getBytes() �ַ��� -> �ֽ�����
		byte[] bytes2 = str10.getBytes();
		System.out.println(Arrays.toString(bytes2));//[49, 50, 51, 97, 98, 99, -42, -48, -50, -60]
		
		//toCharArray() �ַ��� -> �ַ�����
		char[] chars = str10.toCharArray();
		System.out.println(Arrays.toString(chars));//[1, 2, 3, a, b, c, ��, ��]
		
		//�ֽ����� -> �ַ���
		String str11 = new String(bytes2);
		
		//�ַ�����-> �ַ���
		String str12 = new String(chars);
		
		/**
		 * �������÷���
		 */
		//charAt(index)����ָ��indexλ�õ��ַ�
		String str13 = "zhaorong@neusoft.com";
		System.out.println(str13.charAt(8));//@
		
		//concat() ƴ���ַ���
		String str14 = "abc";
		
		str14 = str14 + "123" + "����"; 
		str14 = str14.concat("123").concat("����");
		
		//contains() �ж��ַ����Ƿ����ָ����ֵ---������oracle��like
		System.out.println(str13.contains("@"));//true
		
		//endWith() �ж���....��β
		String fileName = "caixukun.jpg";
		System.out.println(fileName.endsWith(".jpg"));//true
		System.out.println(fileName.endsWith(".gif"));//false
		
		//startWith() �ж���....��ͷ
		String username = "��ܳ�";
		System.out.println(username.startsWith("��"));//true
		System.out.println(username.startsWith("��"));//false
		
		//equals() �ж������ַ����Ƿ���ȣ����ִ�Сд
		String code = "Ea8K"; //�����ϵ���֤��
		String userCode = "ea8k"; //�û��������֤��
		System.out.println(code.equals(userCode));//false
		
		//equalsIgnoreCase() �ж������ַ����Ƿ���ȣ����Դ�Сд
		System.out.println(code.equalsIgnoreCase(userCode));//true
		
		//toLowerCase() תСд
		System.out.println(userCode.toLowerCase());//ea8k
		
		//toUpperCase() ת��д
		System.out.println(userCode.toUpperCase());//EA8K
		
		//indexOf(char) ����ָ���±���ַ�-------�������Ҳ��ҵ�һ�����ֵ��ַ�����������ڣ�����-1
		String str15 = "zhaorong@neusoft.com";
		System.out.println(str15.indexOf('@'));//8
		
		//lastIndexOf(char) ����ָ���±���ַ�-------����������ҵ�һ�����ֵ��ַ�����������ڣ�����-1
		System.out.println(str15.lastIndexOf('.'));//16
		
		/**
		 * У��һ�������Ƿ�Ϸ���
		 * 		1.�������@����
		 * 		2.�������.����
		 * 		3.@���ű�����.����ǰ��
		 * 		4.ֻ�������һ��@����
		 */
		int atIndex = str15.indexOf('@');
		int dotIndex = str15.lastIndexOf('.');
		int atLastIndex = str15.lastIndexOf('@');
		
		if(atIndex >= 0 && dotIndex >= 0 && atIndex < dotIndex && atIndex == atLastIndex)
		{
			System.out.println("����Ϸ�");
		}
		else
		{
			System.out.println("���䲻�Ϸ�����ο����¸�ʽxxxxx@xxxx.xxx");
		}
		
		//isEmpty() �ж��ַ����Ƿ�Ϊ�գ��������Ƿ�>0��
		String str16 = null;
		//System.out.println(str16.isEmpty());//NullPointerException��ָ���쳣
		
		String str17 = "";
		System.out.println(str17.isEmpty());//true
		
		String str18 = " ";
		System.out.println(str18.isEmpty());//false
		
		//length() �ж��ַ����ĳ���
		//System.out.println(str16.length());//NullPointerException��ָ���쳣
		System.out.println(str17.length());//0
		System.out.println(str18.length());//1
		
		if(str16 != null && !"".equals(str16))
		{
			System.out.println("str16��Ϊ��");
		}
		else
		{
			System.out.println("str16Ϊ��");
		}
		
		//substring(beginIndex) ��ȡ�ַ��� ��Ĭ�ϴ�beginIndexλ�ý�ȡ��ĩβ
		String str19 = "zhaorong@neusoft.com";
		System.out.println(str19.substring(8));//@neusoft.com
		System.out.println(str19.substring(str19.indexOf('@')));//@neusoft.com
		
		//substring(beginIndex,endIndex)��ȡ�ַ��� ��Ĭ�ϴ�beginIndexλ�ý�ȡ��endIndex������������λ��
		System.out.println(str19.substring(0,8));//zhaorong
		System.out.println(str19.substring(0,str19.indexOf('@')));//zhaorong
		
		//trim()  ȥ��β�ո�
		String str20 = " zhao rong ";
		System.out.println(str20);       //" zhao rong "
		System.out.println(str20.trim());//"zhao rong"
		
		//replace(oldChar,newChar) �滻�ַ���
		System.out.println(str20.replace(" ", "")); //"zhaorong"
		
		String str21 = "����������ۣ��漰���࣬�漰�������⣬�漰ϰ���ľٴ�";
		System.out.println(str21.replace("����", "**").replace("����", "**"));
		
		/**
		 * ʹ��������ʽ�ķ�����
		 *     [0-9] : ��ʾ0-9֮�������һ�����֣� \d
		 *     [a-zA-Z] : ���26����Сд��ĸ������һ���ַ�
		 *     [a-zA-Z_0-9] �� \w
		 *     
		 *     
		 * 	         ���䣺[0-9]{6} ����   \d{6}
		 *     �ֻ����룺[1]{1}[3|4|5|7|8|9]{1}[0-9]{9}
		 *     ���䣺[a-zA-Z_0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}
		 */
		//matches() ʹ��������ʽУ���ַ����Ƿ����ָ������
		String postCode = "510663";
		String postCodeRegex = "^[0-9]{6}$"; //[0-9]{6}  \d{6}
		System.out.println(postCode.matches(postCodeRegex));
		
		String email = "zhaorong@neusoft.com";
		String emailRegex = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}";
		System.out.println(email.matches(emailRegex));
		
		//replaceAll() ʹ��������ʽ�滻�����ַ�
		String str22 = "i4like5you6hahaha";
		System.out.println(str22.replaceAll("[0-9]", " "));
		
		//split() �ָ��ַ���
		String str23 = "��Ȩ;18;��;110";
		String[] array = str23.split(";");
		for (String str24 : array) {
			System.out.println(str24);
		}
	}
}
