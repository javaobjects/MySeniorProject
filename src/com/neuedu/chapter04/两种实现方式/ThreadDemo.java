package com.neuedu.chapter04.两种实现方式;
/**
	方式一：
		1.自定义类继承Thread类
			public class ThreadDemo extends Thread{ }
		
		2.重写Thread父类中的run()方法
		
		3.测试
			ThreadDemo t1 = new ThreadDemo();
			//t1.run();//此时为单线程，仅为调用一个类的普通方法而已
			t1.start();//启动线程，让线程就绪，但是不会立马执行run方法，等待CPU分配时间片
 */
public class ThreadDemo extends Thread{

	@Override
	public void run() {
		for (int i = 6; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}