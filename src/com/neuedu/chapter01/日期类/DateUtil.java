package com.neuedu.chapter01.������;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ���ڹ����ࣺ
		String -> java.util.Date
		java.util.Date -> String
		
		String -> Calendar
		Calendar -> String
		
		java.sql.Date -> java.util.Date<��>
		java.util.Date -> java.sql.Date<��>
 */
public class DateUtil {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * String -> java.util.Date
	 * 
	 * @param source �ַ�����ʽ������
	 * @return  java.util.Date
	 */
	public static Date stringToUtilDate(String source)
	{
		try {
			return sdf.parse(source);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * java.util.Date -> String
	 * 
	 * @param date ����
	 * @return ��ʽ��֮��������ַ���
	 */
	public static String utilDateToString(Date date)
	{
		return sdf.format(date);
	}
	
	/**
	 * String -> Calendar : 
	 *  		ʵ��ת��·�� String -> Date -> Calendar
	 *  
	 * @param source �ַ�����ʽ������
	 * @return Calendar����
	 */
	public static Calendar stringToCalendar(String source)
	{
		try {
			//�ַ���  -> Date
			Date date = sdf.parse(source);
			
			//Date -> Calendar
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			
			return calendar;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Calendar -> String : 
	 * 			ʵ��ת��·��  Calendar -> Date -> String
	 * 
	 * @param calendar ������
	 * @return ��ʽ����������ַ���
	 */
	public static String calendarToString(Calendar calendar)
	{
		//Calendar -> Date
		Date date = calendar.getTime();
		
		//Date -> String
		return sdf.format(date);
	}
}
