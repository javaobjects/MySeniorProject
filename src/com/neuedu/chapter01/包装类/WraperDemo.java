package com.neuedu.chapter01.��װ��;

public class WraperDemo {

	/**
		�˴�����������ͣ�byte  short int      long  float double char      boolean
		
		                   ��װ�ࣺ Byte  Short Integer  Long  Float Double Character Boolean
	 */
	public static void main(String[] args) {
		//1.������������  -> ��װ��
		int num = 10;
		Integer integer = new Integer(num);//ͨ��������ת��
		
		double dou = 123.456;
		Double doubles = new Double(dou);//ͨ��������ת��
		
		//2.�ַ���  -> ��װ��
		String str = "110";
		Integer integer2 = new Integer(str);//ͨ��������ת��
		
		Integer integer3 = Integer.valueOf(str);//ͨ��XXX.valueOf()ת��
		
		/**
		 * ע�⣺�ַ�������ͨ���������ַ�ʽת��ΪCharacter
		 */
		//isDigit() �ж�ָ���ַ��Ƿ�Ϊ����
		System.out.println(Character.isDigit('a'));//false
		System.out.println(Character.isDigit('1'));//true
		
		//isLetter() �ж�ָ���ַ��Ƿ�Ϊ��ĸ
		System.out.println(Character.isLetter('a'));//true
		System.out.println(Character.isLetter('1'));//false
		
		//3.��װ�� -> ������������
		Integer integer4 = new Integer(100);
		int num2 = integer4.intValue();   //ͨ����װ��.intValue()ת��
		
		//4.��װ�� -> �ַ���
		Integer integer5 = new Integer(666);
		String str2 = integer5.toString();//ͨ����װ��.toString()ת��
		
		//5.�ַ��� -> ������������
		String str3 = "888";
		int num3 = Integer.parseInt(str3);//ͨ����װ��.parseInt()ת��
		
		//6.������������ -> �ַ���
		int num4 = 999;
		
		String str4 = num4 + "";           //����ת��
		String str5 = String.valueOf(num4);//ͨ��String.valueOf()ת��
		
		/**
		 * �Զ�װ�� ��  �Զ�����
		 */
		//�Զ�װ�� : ������������  -> ��װ��
		int num5 = 112;
		Integer integer6 = num5;
		
		//�Զ�����: ��װ�� -> ������������
		Integer integer7 = new Integer(119);
		int num6 = integer7;
		
	}
	
}
