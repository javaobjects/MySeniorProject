package com.neuedu.chapter01.String��;

public class StringBufferAndStringBuilder {
	/**
	 * StringBuffer��StringBuilder���ǳ��ȿɱ���ַ�����
			1. ���ߵĲ���������ͬ��
			2. ���ߵ���Ҫ��������
				 StringBuffer�����̰߳�ȫ�ģ�
				 StringBuilder�����̲߳���ȫ�ġ�
				 
				 StringBuffer��JDK1.0�о��У���StringBuilder����JDK5.0��ų��ֵġ�
				
				 StringBuilder��һЩ����ʵ��Ҫ��StringBuffer��Щ��

	 */
	public static void main(String[] args) {
		
		/**
		 * 	StringBuffer:
		 * 			�̰߳�ȫ��Ч���������÷���ʱ����Ҫ�Ŷӣ������ڶ��߳�
		 */
		long begin = System.currentTimeMillis();//��ȡ��ǰϵͳʱ��ĺ���ֵ
		
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < 20000000; i++) {
			stringBuffer.append(i);
		}
		
		long end = System.currentTimeMillis();//��ȡ��ǰϵͳʱ��ĺ���ֵ
		
		System.out.println("StringBuffer��������������ʱ�䣨����ֵ��:" + (end - begin));//1600
		
		/**
		 * 	StringBuilder:
		 * 			�̲߳���ȫ��Ч�ʸߣ����÷���ʱ������Ҫ�Ŷӣ������ڵ��߳�
		 */
		/*long begin = System.currentTimeMillis();//��ȡ��ǰϵͳʱ��ĺ���ֵ
		
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 20000000; i++) {
			stringBuilder.append(i);
		}
		
		long end = System.currentTimeMillis();//��ȡ��ǰϵͳʱ��ĺ���ֵ
		
		System.out.println("StringBuilder��������������ʱ�䣨����ֵ��:" + (end - begin));*///1100
		
	}
	
}
