package com.neuedu.chapter04.���÷���;

/**
 * 
 * �̵߳����ȼ���Ĭ�������߳����ȼ�Ϊ5��ȡֵ1~10֮�䣬����Խ�����ȼ�Խ�ߣ��ܹ���õ�CPU��ʱ��Խ�࣬
 *                                 ��֮������ԽС�����ȼ�Խ�ͣ��ܹ���õ�CPU��ʱ��Խ��
 * 
 * Thread���������������ʾ���õ��߳����ȼ���
		Thread.MIN_PRIORITY       //1
		Thread.NORM_PRIORITY      //5
		Thread.MAX_PRIORITY       //10

 */
public class PriorityDemo {

	public static void main(String[] args) {
		//�߳�һ
		Thread2 t1 = new Thread2();
		t1.setName("�߳�1");
		t1.start();
		
		//�̶߳�
		Thread2 t2 = new Thread2();
		t2.setName("�߳�2");
		t2.start();
		
		//getPriority() ��ȡ�̵߳����ȼ�
		System.out.println("t1Ĭ�����ȼ�:" + t1.getPriority());//5
		System.out.println("t2Ĭ�����ȼ�:" + t2.getPriority());//5
		
		//setPriority() �����̵߳����ȼ�
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t2.setPriority(Thread.MAX_PRIORITY);//10
		
		System.out.println("t1�޸ĺ�����ȼ�:" + t1.getPriority());//1
		System.out.println("t2�޸ĺ�����ȼ�:" + t2.getPriority());//10
	}
}

class Thread2 extends Thread{

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
