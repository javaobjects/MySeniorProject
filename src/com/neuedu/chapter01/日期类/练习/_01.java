package com.neuedu.chapter01.日期类.练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 9. 【综合练习】输入日期格式字符串作为商品的生产日期，输入保质期（天）；计算截止到今天，该商品还有多少天会过保质期
	1、控制台输入字符串转为日期格式
	2、将输入日期增加保质期天数
	3、取得当前系统日期，比较两个日期，如果过期输出“该商品已经过期”
  	    
	4、如果没有过期，输出天数
 */
public class _01 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		
		//1、控制台输入字符串转为日期格式
		System.out.println("请输入商品的生产日期:（yyyy-MM-dd）");
		String strDate = scanner.nextLine();
		
		//字符串 -> 日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date produceDate = sdf.parse(strDate);
		
		//输入保质期天数
		System.out.println("请输入保质期（天）：");
		long day = scanner.nextLong();
		
		//2、将输入日期增加保质期天数（得到：过期日期）
		long millionSecond = produceDate.getTime() + day*24*60*60*1000;
		Date deadLineDate = new Date(millionSecond);
		
		//今天的日期
		Date today = new Date();
		System.out.println("今天的日期为：" + sdf.format(today) );
		System.out.println("过期的日期为：" + sdf.format(deadLineDate) );
		
		//3、取得当前系统日期，比较两个日期，如果过期输出“该商品已经过期”
		if(deadLineDate.compareTo(today) == -1)
		{
			System.out.println("该商品已经过期");
		}
		//4、如果没有过期，输出天数
		else
		{
			//剩余天数
			long availableDays = (deadLineDate.getTime() - today.getTime())/1000/60/60/24;
			System.out.println("还有 " + availableDays + "天过期");
		}
	}
	
}
