package com.neuedu.chapter04.两种实现方式;
/**
	方式一：
		1.自定义类实现Runable接口
			public class RunableDemo implements Runnable{ }
			
		2.重写Runable父类中的run()方法
		
		3.测试
			RunableDemo runableDemo = new RunableDemo();
			//t3.start();//没有start()方法，不能启动一个线程
			
			//开启线程
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