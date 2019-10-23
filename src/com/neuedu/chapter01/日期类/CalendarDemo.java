package com.neuedu.chapter01.日期类;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		/**
		 * 1.创建对象
		 */
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		/**
		 * 2.常用方法
		 */
		//set() 根据指定的时间属性，替换原有的日期
		//calendar.set(2020, 1, 1, 17, 16, 10);
		//System.out.println(calendar);
		
		//add() 添加日期属性
		//calendar.add(Calendar.DAY_OF_MONTH, 5);//加5天
		//System.out.println(calendar);
		
		//calendar.add(Calendar.MONTH, 1);//加1月
		//System.out.println(calendar);
		
		//get() 获取指定属性的日期信息
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;  // 0~11 表示1-12月
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		int hour12 = calendar.get(Calendar.HOUR);       //12小时制
		int hour24 = calendar.get(Calendar.HOUR_OF_DAY);//24小时制
		
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);//1~7表示星期日~星期六
		
		int am = calendar.get(Calendar.AM_PM);//上午 0  下午1
		
		//2019-9-5  17:27:32  5 1
		System.out.println(year + "-" + month + "-" + day + "  " + hour24 + ":" + minute + ":" +second + "  " + weekday + " " + am);
	
		//getTime() : 将Calendar -> Date
		Date date = calendar.getTime();
	}
	
}
