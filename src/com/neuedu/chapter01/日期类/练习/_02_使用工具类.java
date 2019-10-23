package com.neuedu.chapter01.日期类.练习;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.neuedu.chapter01.日期类.DateUtil;

/**
 * 4、巴黎时间比北京时间晚7个小时，纽约时间比北京时间晚12个小时，试编写一程序，根据输入的北京时间输出相应的巴黎和纽约时间。[必做题]
 */
public class _02_使用工具类 {
	
	public static void main(String[] args) throws ParseException {
		//方式一
		//methodOne();
		
		//方式二
		//MethodTwo();
	}

	private static void MethodTwo(){
		//输入北京时间
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入北京时间：");
		String strDate = scanner.nextLine();
		
		//字符串 -> 日历Calendar
		//北京时间
		Calendar beijing = DateUtil.stringToCalendar(strDate);
		System.out.println("北京时间：" + DateUtil.calendarToString(beijing));
		
		//巴黎时间：比北京时间晚7个小时
		beijing.add(Calendar.HOUR, -7);
		System.out.println("巴黎时间：" + DateUtil.calendarToString(beijing));
		
		//纽约时间：比北京时间晚12个小时
		beijing.add(Calendar.HOUR, -5);
		System.out.println("纽约时间：" + DateUtil.calendarToString(beijing));
	}

	private static void methodOne() throws ParseException {
		//输入北京时间
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入北京时间：");
		String strDate = scanner.nextLine();
		
		//字符串 - >日期
		//北京时间
		Date beijing = DateUtil.stringToUtilDate(strDate);
		System.out.println("北京时间：" + DateUtil.utilDateToString(beijing));
		
		//巴黎时间：比北京时间晚7个小时
		Date paris = new Date(beijing.getTime() - 7*60*60*1000);
		System.out.println("巴黎时间：" + DateUtil.utilDateToString(paris));
		
		//纽约时间：比北京时间晚12个小时
		Date newYork = new Date(beijing.getTime() - 12*60*60*1000);
		System.out.println("纽约时间：" + DateUtil.utilDateToString(newYork));
	}
}
