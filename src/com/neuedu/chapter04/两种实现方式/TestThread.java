package com.neuedu.chapter04.两种实现方式;

public class TestThread {

	public static void main(String[] args) {
		//线程一
		ThreadDemo t1 = new ThreadDemo();
		//t1.run();//此时为单线程，仅为调用一个类的普通方法而已
		t1.start();//启动线程，让线程就绪，但是不会立马执行run方法，等待CPU分配时间片
		
		//线程二
		ThreadDemo t2 = new ThreadDemo();
		t2.start();//启动线程，让线程就绪，但是不会立马执行run方法，等待CPU分配时间片

		//主线程
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}