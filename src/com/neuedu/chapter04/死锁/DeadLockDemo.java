package com.neuedu.chapter04.死锁;

public class DeadLockDemo {

	public static void main(String[] args) {
		Thread_1 t1 = new Thread_1();
		t1.start();
		
		Thread_2 t2 = new Thread_2();
		t2.start();
	}
	
}
class Thread_1 extends Thread
{
	@Override
	public void run() {
		
		while(true)
		{
			synchronized ("a") {
				
				System.out.println("Thread_1拿到了a锁");
				
				synchronized ("b") {
					
					System.out.println("Thread_1拿到了b锁");
				}
			}
		}
	}
}

class Thread_2 extends Thread
{
	@Override
	public void run() {
		
		while(true)
		{
			synchronized ("b") {
				
				System.out.println("Thread_2拿到了b锁");
				
				synchronized ("a") {
					
					System.out.println("Thread_2拿到了a锁");
				}
			}
		}
	}
}
