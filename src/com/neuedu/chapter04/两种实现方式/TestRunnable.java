package com.neuedu.chapter04.两种实现方式;

public class TestRunnable {

	public static void main(String[] args) {
		/**
		 * 测试继承Thread
		 */
		//线程一
		//ThreadDemo t1 = new ThreadDemo();
		//t1.run();//此时为单线程，仅为调用一个类的普通方法而已
		//t1.start();//启动线程，让线程就绪，但是不会立马执行run方法，等待CPU分配时间片
		
		//线程二
		//ThreadDemo t2 = new ThreadDemo();
		//t2.start();//启动线程，让线程就绪，但是不会立马执行run方法，等待CPU分配时间片

		/**
		 * 测试实现Runnable
		 */
		RunableDemo runableDemo = new RunableDemo();
		//t3.start();//没有start()方法，不能启动一个线程
		
		//线程三
		Thread t3 = new Thread(runableDemo);
		t3.start();
		
		//线程四
		Thread t4 = new Thread(runableDemo);
		t4.start();
		
		//主线程
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}