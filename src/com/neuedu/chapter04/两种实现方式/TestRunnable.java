package com.neuedu.chapter04.����ʵ�ַ�ʽ;

public class TestRunnable {

	public static void main(String[] args) {
		/**
		 * ���Լ̳�Thread
		 */
		//�߳�һ
		//ThreadDemo t1 = new ThreadDemo();
		//t1.run();//��ʱΪ���̣߳���Ϊ����һ�������ͨ��������
		//t1.start();//�����̣߳����߳̾��������ǲ�������ִ��run�������ȴ�CPU����ʱ��Ƭ
		
		//�̶߳�
		//ThreadDemo t2 = new ThreadDemo();
		//t2.start();//�����̣߳����߳̾��������ǲ�������ִ��run�������ȴ�CPU����ʱ��Ƭ

		/**
		 * ����ʵ��Runnable
		 */
		RunableDemo runableDemo = new RunableDemo();
		//t3.start();//û��start()��������������һ���߳�
		
		//�߳���
		Thread t3 = new Thread(runableDemo);
		t3.start();
		
		//�߳���
		Thread t4 = new Thread(runableDemo);
		t4.start();
		
		//���߳�
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}