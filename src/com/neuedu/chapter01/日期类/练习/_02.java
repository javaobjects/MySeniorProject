package com.neuedu.chapter01.日期类.练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 4、巴黎时间比北京时间晚7个小时，纽约时间比北京时间晚12个小时，试编写一程序，根据输入的北京时间输出相应的巴黎和纽约时间。[必做题]
 */
public class _02 {
	
	public static void main(String[] args) throws ParseException {
		//方式一
		//methodOne();
		
		//方式二
		MethodTwo();
	}

	private static void MethodTwo() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//输入北京时间
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入北京时间：");
		String strDate = scanner.nextLine();
		
		//字符串 -> 日期
		//北京时间
		Calendar beijing = Calendar.getInstance();
		beijing.setTime(sdf.parse(strDate));
		System.out.println("北京时间：" + sdf.format(beijing.getTime()));
		
		//巴黎时间：比北京时间晚7个小时
		beijing.add(Calendar.HOUR, -7);
		System.out.println("巴黎时间：" + sdf.format(beijing.getTime()));
		
		//纽约时间：比北京时间晚12个小时
		beijing.add(Calendar.HOUR, -5);
		System.out.println("纽约时间：" + sdf.format(beijing.getTime()));
	}

	private static void methodOne() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//输入北京时间
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入北京时间：");
		String strDate = scanner.nextLine();
		
		//字符串 - >日期
		//北京时间
		Date beijing = sdf.parse(strDate);
		System.out.println("北京时间：" + sdf.format(beijing));
		
		//巴黎时间：比北京时间晚7个小时
		Date paris = new Date(beijing.getTime() - 7*60*60*1000);
		System.out.println("巴黎时间：" + sdf.format(paris));
		
		//纽约时间：比北京时间晚12个小时
		Date newYork = new Date(beijing.getTime() - 12*60*60*1000);
		System.out.println("纽约时间：" + sdf.format(newYork));
	}
}
