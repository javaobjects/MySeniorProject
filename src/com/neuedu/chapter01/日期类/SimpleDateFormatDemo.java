package com.neuedu.chapter01.日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		/**
		 * format（） 日期 -> 指定格式的字符串
		 * 
		 * 		M 月份
		 *      m 分钟
		 *      H 24小时制
		 *      h 12小时制
		 *      E 星期
		 *      a 午别
		 */
		Date now = new Date();
		System.out.println(now);//Thu Sep 05 11:21:19 CST 2019
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//数据库 yyyy-mm-dd hh24:mi:ss
		String strDate = sdf.format(now);
		System.out.println(strDate);//2019-09-05 11:23:39
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//数据库 yyyy-mm-dd hh24:mi:ss
		String strDate2 = sdf2.format(now);
		System.out.println(strDate2);//2019/09/05 11:24:20
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss E a");//数据库 yyyy-mm-dd hh24:mi:ss
		String strDate3 = sdf3.format(now);
		System.out.println(strDate3);//2019年09月05日  11:28:10  星期四  上午
		
		/**
		 * parse（） 指定格式的字符串 -> 日期
		 */
		String str = "2019-09-05 11:25:21";
		System.out.println(sdf.parse(str));//Thu Sep 05 11:25:21 CST 2019
		
		String str2 = "2019/09/05 11:25:21";
		System.out.println(sdf2.parse(str2));//Thu Sep 05 11:25:21 CST 2019
		
		String str3 = "2019年09月05日  11:25:21 星期四 上午";
		System.out.println(sdf3.parse(str3));//Thu Sep 05 11:25:21 CST 2019
	}

}
