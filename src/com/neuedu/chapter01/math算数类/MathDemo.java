package com.neuedu.chapter01.math������;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		/**
		 * 1.��������Math�����е������뷽����Ϊstatic���Σ�����Ҫnew����
		 */
		
		/**
		 * 2.��������
		 */
		//Բ����
		System.out.println(Math.PI);//3.141592653589793
		
		//��Ȼ��������
		System.out.println(Math.E);//2.718281828459045
		
		/**
		 * 3.���÷���
		 */
		//abs() ȡ����ֵ
		System.out.println(Math.abs(123.456));//123.456
		System.out.println(Math.abs(-123.456));//123.456
		
		//round() ��������ȡ��
		System.out.println(Math.round(123.456));//123
		System.out.println(Math.round(123.556));//124
		System.out.println(Math.round(-123.456));//-123
		System.out.println(Math.round(-123.556));//-124
		
		//ceil() ����ȡ��:ȡ���ڸ�ֵ��С������
		System.out.println(Math.ceil(123.456));//124
		System.out.println(Math.ceil(123.556));//124
		System.out.println(Math.ceil(-123.456));//-123
		System.out.println(Math.ceil(-123.556));//-123
		
		//floor() ����ȡ����ȡС�ڸ�ֵ����������
		System.out.println(Math.floor(123.456));//123
		System.out.println(Math.floor(123.556));//123
		System.out.println(Math.floor(-123.456));//-124
		System.out.println(Math.floor(-123.556));//-124
		
		//max() ȡ���ֵ
		System.out.println(Math.max(10, 20));//20
		
		//min() ȡ��Сֵ
		System.out.println(Math.min(10, 20));//10
		
		//random() ��ȡ���ֵ��Ĭ��0.0~1.0֮��
		System.out.println(Math.random());//0.0~1.0֮��
		System.out.println(Math.round(Math.random()*10));//0~10֮�������
		
		//Random��
		Random random = new Random();
		System.out.println(random.nextInt());  //����int�����ڵ���Чint����
		System.out.println(random.nextInt(11));//0~10֮�������
		
		/**
		 * ���������֤��:
		 * 
		 * 		���֡���д��ĸ��Сд��ĸ�������� 0��1��O��o��L��l
		 */
		char[] codes = new char[]{'2','3','4','5','6','7','8','9','a','b','c','d','e','f','A','B','C','D','E','F','G','H'};
		
		//��֤��
		String code = "";
		
		for (int i = 1; i <= 4; i++) {
			int index = random.nextInt(codes.length);
			code += codes[index];
		}
		
		System.out.println("�����֤�룺" + code);
	}
}
