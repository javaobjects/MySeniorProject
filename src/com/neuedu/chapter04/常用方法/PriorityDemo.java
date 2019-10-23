package com.neuedu.chapter04.常用方法;

/**
 * 
 * 线程的优先级：默认所有线程优先级为5，取值1~10之间，数字越大，优先级越高，能够获得的CPU的时间越多，
 *                                 反之，数字越小，优先级越低，能够获得的CPU的时间越少
 * 
 * Thread类的三个常量，表示常用的线程优先级：
		Thread.MIN_PRIORITY       //1
		Thread.NORM_PRIORITY      //5
		Thread.MAX_PRIORITY       //10

 */
public class PriorityDemo {

	public static void main(String[] args) {
		//线程一
		Thread2 t1 = new Thread2();
		t1.setName("线程1");
		t1.start();
		
		//线程二
		Thread2 t2 = new Thread2();
		t2.setName("线程2");
		t2.start();
		
		//getPriority() 获取线程的优先级
		System.out.println("t1默认优先级:" + t1.getPriority());//5
		System.out.println("t2默认优先级:" + t2.getPriority());//5
		
		//setPriority() 设置线程的优先级
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t2.setPriority(Thread.MAX_PRIORITY);//10
		
		System.out.println("t1修改后的优先级:" + t1.getPriority());//1
		System.out.println("t2修改后的优先级:" + t2.getPriority());//10
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
