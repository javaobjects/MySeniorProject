package com.neuedu.chapter01.������.��ϰ;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.neuedu.chapter01.������.DateUtil;

/**
 * 4������ʱ��ȱ���ʱ����7��Сʱ��ŦԼʱ��ȱ���ʱ����12��Сʱ���Ա�дһ���򣬸�������ı���ʱ�������Ӧ�İ����ŦԼʱ�䡣[������]
 */
public class _02_ʹ�ù����� {
	
	public static void main(String[] args) throws ParseException {
		//��ʽһ
		//methodOne();
		
		//��ʽ��
		//MethodTwo();
	}

	private static void MethodTwo(){
		//���뱱��ʱ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뱱��ʱ�䣺");
		String strDate = scanner.nextLine();
		
		//�ַ��� -> ����Calendar
		//����ʱ��
		Calendar beijing = DateUtil.stringToCalendar(strDate);
		System.out.println("����ʱ�䣺" + DateUtil.calendarToString(beijing));
		
		//����ʱ�䣺�ȱ���ʱ����7��Сʱ
		beijing.add(Calendar.HOUR, -7);
		System.out.println("����ʱ�䣺" + DateUtil.calendarToString(beijing));
		
		//ŦԼʱ�䣺�ȱ���ʱ����12��Сʱ
		beijing.add(Calendar.HOUR, -5);
		System.out.println("ŦԼʱ�䣺" + DateUtil.calendarToString(beijing));
	}

	private static void methodOne() throws ParseException {
		//���뱱��ʱ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뱱��ʱ�䣺");
		String strDate = scanner.nextLine();
		
		//�ַ��� - >����
		//����ʱ��
		Date beijing = DateUtil.stringToUtilDate(strDate);
		System.out.println("����ʱ�䣺" + DateUtil.utilDateToString(beijing));
		
		//����ʱ�䣺�ȱ���ʱ����7��Сʱ
		Date paris = new Date(beijing.getTime() - 7*60*60*1000);
		System.out.println("����ʱ�䣺" + DateUtil.utilDateToString(paris));
		
		//ŦԼʱ�䣺�ȱ���ʱ����12��Сʱ
		Date newYork = new Date(beijing.getTime() - 12*60*60*1000);
		System.out.println("ŦԼʱ�䣺" + DateUtil.utilDateToString(newYork));
	}
}
