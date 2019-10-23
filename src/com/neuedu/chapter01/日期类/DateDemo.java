package com.neuedu.chapter01.������;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		/**
		 * 1.��������
		 */
		//1.��ȡ��ǰϵͳʱ��
		Date now = new Date();
		System.out.println(now);//Thu Sep 05 11:11:53 CST 2019
		
		//2.��ȡָ������ֵ������
		Date date = new Date(1667653204883L);
		System.out.println(date);//Sat Nov 05 21:00:04 CST 2022
		
		/**
		 * 2.���÷���
		 */
		//getTime() ��ȡ���ں���ֵ
		System.out.println(now.getTime());//1567653204883
		
		//after() ���Դ������Ƿ���ָ������֮��
		System.out.println(now.after(date)); //now > date,����true������false
		
		//before() ���Դ������Ƿ���ָ������֮ǰ
		System.out.println(now.before(date));//now < date������true,����false
		
		//compareTo() �Ƚ��������ڵ�˳��
		System.out.println(now.compareTo(date));//  -1 now < date,����-1
		System.out.println(date.compareTo(now));//  1  date > now������+1
		System.out.println(date.compareTo(date));// 0 ����������ȣ�����0
		
		//equals() �Ƚ����������Ƿ���ȣ��Ƚ��������ڵĺ���ֵ
		System.out.println(now.equals(date));//false
		
		//toLocaleString() ������ת��Ϊ���ظ�ʽ�ַ���
		System.out.println(now.toLocaleString());//2019-9-5 11:20:27
	}
	
}
