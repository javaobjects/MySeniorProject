package com.neuedu.chapter04.����ʵ�ַ�ʽ;
/**
	��ʽһ��
		1.�Զ�����ʵ��Runable�ӿ�
			public class RunableDemo implements Runnable{ }
			
		2.��дRunable�����е�run()����
		
		3.����
			RunableDemo runableDemo = new RunableDemo();
			//t3.start();//û��start()��������������һ���߳�
			
			//�����߳�
			Thread t3 = new Thread(runableDemo);
			t3.start();
 */
public class RunableDemo implements Runnable{

	@Override
	public void run() {
		for (int i = 6; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}