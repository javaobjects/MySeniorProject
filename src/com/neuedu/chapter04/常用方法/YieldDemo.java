package com.neuedu.chapter04.���÷���;
/**
 * yield():�ó������CPUʱ����������߳�
 *
 */
public class YieldDemo {

	public static void main(String[] args) {
		Thread5 t1 = new Thread5();
		t1.start();
		
		Thread6 t2 = new Thread6();
		t2.start();
	}
	
}
class Thread5 extends Thread{

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);

			Thread.yield();//�ó������CPUʱ����������߳�
		}
	}
}

class Thread6 extends Thread{

	@Override
	public void run() {
		for (int i = 11; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);

		}
	}
}