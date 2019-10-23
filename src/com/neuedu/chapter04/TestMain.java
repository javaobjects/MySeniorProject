package com.neuedu.chapter04;

public class TestMain {

	/**
	 * main方法为主线程：此时，为单线程的程序
	 */
	public static void main(String[] args) {
		
		method();
		
		for (int i = 6; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
	}
	
	public static void method()
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " +i);
		}
	}
	
}
