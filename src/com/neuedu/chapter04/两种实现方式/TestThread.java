package com.neuedu.chapter04.����ʵ�ַ�ʽ;

public class TestThread {

	public static void main(String[] args) {
		//�߳�һ
		ThreadDemo t1 = new ThreadDemo();
		//t1.run();//��ʱΪ���̣߳���Ϊ����һ�������ͨ��������
		t1.start();//�����̣߳����߳̾��������ǲ�������ִ��run�������ȴ�CPU����ʱ��Ƭ
		
		//�̶߳�
		ThreadDemo t2 = new ThreadDemo();
		t2.start();//�����̣߳����߳̾��������ǲ�������ִ��run�������ȴ�CPU����ʱ��Ƭ

		//���߳�
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}