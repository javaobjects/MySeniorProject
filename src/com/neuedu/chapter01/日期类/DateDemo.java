package com.neuedu.chapter01.日期类;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		/**
		 * 1.创建对象
		 */
		//1.获取当前系统时间
		Date now = new Date();
		System.out.println(now);//Thu Sep 05 11:11:53 CST 2019
		
		//2.获取指定毫秒值的日期
		Date date = new Date(1667653204883L);
		System.out.println(date);//Sat Nov 05 21:00:04 CST 2022
		
		/**
		 * 2.常用方法
		 */
		//getTime() 获取日期毫秒值
		System.out.println(now.getTime());//1567653204883
		
		//after() 测试此日期是否在指定日期之后
		System.out.println(now.after(date)); //now > date,返回true，否则false
		
		//before() 测试此日期是否在指定日期之前
		System.out.println(now.before(date));//now < date，返回true,否则false
		
		//compareTo() 比较两个日期的顺序
		System.out.println(now.compareTo(date));//  -1 now < date,返回-1
		System.out.println(date.compareTo(now));//  1  date > now，返回+1
		System.out.println(date.compareTo(date));// 0 两个日期相等，返回0
		
		//equals() 比较两个日期是否相等，比较两个日期的毫秒值
		System.out.println(now.equals(date));//false
		
		//toLocaleString() 将日期转换为本地格式字符串
		System.out.println(now.toLocaleString());//2019-9-5 11:20:27
	}
	
}
