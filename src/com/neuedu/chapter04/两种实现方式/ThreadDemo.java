package com.neuedu.chapter04.����ʵ�ַ�ʽ;
/**
	��ʽһ��
		1.�Զ�����̳�Thread��
			public class ThreadDemo extends Thread{ }
		
		2.��дThread�����е�run()����
		
		3.����
			ThreadDemo t1 = new ThreadDemo();
			//t1.run();//��ʱΪ���̣߳���Ϊ����һ�������ͨ��������
			t1.start();//�����̣߳����߳̾��������ǲ�������ִ��run�������ȴ�CPU����ʱ��Ƭ
 */
public class ThreadDemo extends Thread{

	@Override
	public void run() {
		for (int i = 6; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}