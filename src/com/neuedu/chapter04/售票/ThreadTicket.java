package com.neuedu.chapter04.售票;

public class ThreadTicket extends Thread{

	private int num = 50;

	@Override
	public void run() {
		while(num > 0)
		{
			System.out.println("售票员 【" + Thread.currentThread().getName() + "】，售出了票NO." + num);
			num--;
		}
	}
}
