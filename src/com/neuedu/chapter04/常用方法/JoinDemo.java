package com.neuedu.chapter04.常用方法;

/**
 * join:导致当前线程等待，直到调用该方法之前的所有线程执行结束
 */
public class JoinDemo {

	public static void main(String[] args) {
		Thread4 t1 = new Thread4(1,10);
		t1.start();
		
		Thread4 t2 = new Thread4(11,20);
		t2.start();
		
		try {
			t2.join();//让t2插队，让t2之前的所有线程先执行完成，后续的代码才可以继续执行
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		for (int i = 100; i <= 110; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread4 extends Thread{

	private int begin;
	private int end;
	
	public Thread4(int begin,int end)
	{
		this.begin = begin;
		this.end = end;
	}
	
	@Override
	public void run() {
		for (int i = begin; i <= end; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
