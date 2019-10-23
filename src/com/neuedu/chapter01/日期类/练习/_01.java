package com.neuedu.chapter01.������.��ϰ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 9. ���ۺ���ϰ���������ڸ�ʽ�ַ�����Ϊ��Ʒ���������ڣ����뱣���ڣ��죩�������ֹ�����죬����Ʒ���ж�������������
	1������̨�����ַ���תΪ���ڸ�ʽ
	2���������������ӱ���������
	3��ȡ�õ�ǰϵͳ���ڣ��Ƚ��������ڣ�����������������Ʒ�Ѿ����ڡ�
  	    
	4�����û�й��ڣ��������
 */
public class _01 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		
		//1������̨�����ַ���תΪ���ڸ�ʽ
		System.out.println("��������Ʒ����������:��yyyy-MM-dd��");
		String strDate = scanner.nextLine();
		
		//�ַ��� -> ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date produceDate = sdf.parse(strDate);
		
		//���뱣��������
		System.out.println("�����뱣���ڣ��죩��");
		long day = scanner.nextLong();
		
		//2���������������ӱ������������õ����������ڣ�
		long millionSecond = produceDate.getTime() + day*24*60*60*1000;
		Date deadLineDate = new Date(millionSecond);
		
		//���������
		Date today = new Date();
		System.out.println("���������Ϊ��" + sdf.format(today) );
		System.out.println("���ڵ�����Ϊ��" + sdf.format(deadLineDate) );
		
		//3��ȡ�õ�ǰϵͳ���ڣ��Ƚ��������ڣ�����������������Ʒ�Ѿ����ڡ�
		if(deadLineDate.compareTo(today) == -1)
		{
			System.out.println("����Ʒ�Ѿ�����");
		}
		//4�����û�й��ڣ��������
		else
		{
			//ʣ������
			long availableDays = (deadLineDate.getTime() - today.getTime())/1000/60/60/24;
			System.out.println("���� " + availableDays + "�����");
		}
	}
	
}
