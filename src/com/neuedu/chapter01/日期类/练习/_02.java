package com.neuedu.chapter01.������.��ϰ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 4������ʱ��ȱ���ʱ����7��Сʱ��ŦԼʱ��ȱ���ʱ����12��Сʱ���Ա�дһ���򣬸�������ı���ʱ�������Ӧ�İ����ŦԼʱ�䡣[������]
 */
public class _02 {
	
	public static void main(String[] args) throws ParseException {
		//��ʽһ
		//methodOne();
		
		//��ʽ��
		MethodTwo();
	}

	private static void MethodTwo() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//���뱱��ʱ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뱱��ʱ�䣺");
		String strDate = scanner.nextLine();
		
		//�ַ��� -> ����
		//����ʱ��
		Calendar beijing = Calendar.getInstance();
		beijing.setTime(sdf.parse(strDate));
		System.out.println("����ʱ�䣺" + sdf.format(beijing.getTime()));
		
		//����ʱ�䣺�ȱ���ʱ����7��Сʱ
		beijing.add(Calendar.HOUR, -7);
		System.out.println("����ʱ�䣺" + sdf.format(beijing.getTime()));
		
		//ŦԼʱ�䣺�ȱ���ʱ����12��Сʱ
		beijing.add(Calendar.HOUR, -5);
		System.out.println("ŦԼʱ�䣺" + sdf.format(beijing.getTime()));
	}

	private static void methodOne() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//���뱱��ʱ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뱱��ʱ�䣺");
		String strDate = scanner.nextLine();
		
		//�ַ��� - >����
		//����ʱ��
		Date beijing = sdf.parse(strDate);
		System.out.println("����ʱ�䣺" + sdf.format(beijing));
		
		//����ʱ�䣺�ȱ���ʱ����7��Сʱ
		Date paris = new Date(beijing.getTime() - 7*60*60*1000);
		System.out.println("����ʱ�䣺" + sdf.format(paris));
		
		//ŦԼʱ�䣺�ȱ���ʱ����12��Сʱ
		Date newYork = new Date(beijing.getTime() - 12*60*60*1000);
		System.out.println("ŦԼʱ�䣺" + sdf.format(newYork));
	}
}
