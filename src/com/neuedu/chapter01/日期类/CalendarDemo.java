package com.neuedu.chapter01.������;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		/**
		 * 1.��������
		 */
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		/**
		 * 2.���÷���
		 */
		//set() ����ָ����ʱ�����ԣ��滻ԭ�е�����
		//calendar.set(2020, 1, 1, 17, 16, 10);
		//System.out.println(calendar);
		
		//add() �����������
		//calendar.add(Calendar.DAY_OF_MONTH, 5);//��5��
		//System.out.println(calendar);
		
		//calendar.add(Calendar.MONTH, 1);//��1��
		//System.out.println(calendar);
		
		//get() ��ȡָ�����Ե�������Ϣ
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;  // 0~11 ��ʾ1-12��
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		int hour12 = calendar.get(Calendar.HOUR);       //12Сʱ��
		int hour24 = calendar.get(Calendar.HOUR_OF_DAY);//24Сʱ��
		
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);//1~7��ʾ������~������
		
		int am = calendar.get(Calendar.AM_PM);//���� 0  ����1
		
		//2019-9-5  17:27:32  5 1
		System.out.println(year + "-" + month + "-" + day + "  " + hour24 + ":" + minute + ":" +second + "  " + weekday + " " + am);
	
		//getTime() : ��Calendar -> Date
		Date date = calendar.getTime();
	}
	
}
