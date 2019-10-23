package com.neuedu.chapter01.包装类;

public class WraperDemo {

	/**
		八大基本数据类型：byte  short int      long  float double char      boolean
		
		                   包装类： Byte  Short Integer  Long  Float Double Character Boolean
	 */
	public static void main(String[] args) {
		//1.基本数据类型  -> 包装类
		int num = 10;
		Integer integer = new Integer(num);//通过构造器转换
		
		double dou = 123.456;
		Double doubles = new Double(dou);//通过构造器转换
		
		//2.字符串  -> 包装类
		String str = "110";
		Integer integer2 = new Integer(str);//通过构造器转换
		
		Integer integer3 = Integer.valueOf(str);//通过XXX.valueOf()转换
		
		/**
		 * 注意：字符串不能通过以上两种方式转换为Character
		 */
		//isDigit() 判断指定字符是否为数字
		System.out.println(Character.isDigit('a'));//false
		System.out.println(Character.isDigit('1'));//true
		
		//isLetter() 判断指定字符是否为字母
		System.out.println(Character.isLetter('a'));//true
		System.out.println(Character.isLetter('1'));//false
		
		//3.包装类 -> 基本数据类型
		Integer integer4 = new Integer(100);
		int num2 = integer4.intValue();   //通过包装类.intValue()转换
		
		//4.包装类 -> 字符串
		Integer integer5 = new Integer(666);
		String str2 = integer5.toString();//通过包装类.toString()转换
		
		//5.字符串 -> 基本数据类型
		String str3 = "888";
		int num3 = Integer.parseInt(str3);//通过包装类.parseInt()转换
		
		//6.基本数据类型 -> 字符串
		int num4 = 999;
		
		String str4 = num4 + "";           //简易转换
		String str5 = String.valueOf(num4);//通过String.valueOf()转换
		
		/**
		 * 自动装箱 与  自动拆箱
		 */
		//自动装箱 : 基本数据类型  -> 包装类
		int num5 = 112;
		Integer integer6 = num5;
		
		//自动拆箱: 包装类 -> 基本数据类型
		Integer integer7 = new Integer(119);
		int num6 = integer7;
		
	}
	
}
