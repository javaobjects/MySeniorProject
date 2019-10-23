package com.neuedu.chapter01.object��;

public class ObjectDemo {

	public static void main(String[] args) {
		/**
		 * 1.�������󣨹��캯����
		 */
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		/**
		 * 2.���÷���
		 */
		//equals() �ж�ĳ�������Ƿ���˶���"���"
		System.out.println(obj1 == obj2);     //false  �Ƚϵ�ֵַ
		System.out.println(obj1.equals(obj2));//false  �Ƚϵ�ֵַ
		
		//hashCode() ���ظö����ʮ���ƹ�ϣ��ֵ�����������õ�ַ����ÿ����������֤ID
		System.out.println(obj1.hashCode());//931262393
		System.out.println(obj2.hashCode());//866219815
		
		//toString() ������ת��Ϊ�ַ�������: ����  +  ���� + '@' + ʮ�����Ƶ�hashCode
		System.out.println(obj1.toString());//java.lang.Object@3781efb9
		System.out.println(obj2.toString());//java.lang.Object@33a17727
		
		/**
		 *  == �� equals�ıȽϣ�
		 *      
		 *      ==���ȿ��ԱȽϻ����������ͣ�Ҳ���ԱȽ���������
		 *      	��==�Ƚϻ�����������ʱ���Ƚ�����ֵ������ 3 == 13��
		 *          ��==�Ƚ��������ͣ��Ƚ����õ�ַ������obj1 == obj2��
		 *          
		 *      equals������ֻ�ܱȽ��������ͣ���Ĭ������±Ƚ����õ�ַ
		 *  	              ���Ǿ����Ƿ���ȣ��迴�����Ƿ���д�����equals��������
		 */
	}
	
}
