package com.neuedu.chapter04.终止线程;

/**
 *  1. 自动终止 — 一个线程完成执行后，不能再次运行 
	2. 手动终止
		  ① stop( ) —— 已过时，基本不用
		  ② interrupt( ) —— 粗暴的终止方式
		  ③ 可通过使用一个标志指示 run 方法退出，从而终止线程
 */
public class StopThreadDemo {

	public static void main(String[] args) {
		Thread5 t1 = new Thread5();
		t1.start();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			
			//创造条件终止线程
			if(i%5 ==0)
			{
				t1.setFlag(false);//------------------终止线程
				System.out.println(Thread.currentThread().getName() + ": hello,bye bye!!!");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Thread5 extends Thread
{
	private boolean flag = true;
	
	@Override
	public void run() {
		while(flag)
		{
			System.out.println("say hello!!!!!");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setFlag(boolean flag)
	{
		this.flag = flag;
	}
}
