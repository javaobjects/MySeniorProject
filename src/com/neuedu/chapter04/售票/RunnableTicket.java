package com.neuedu.chapter04.售票;

/**
 * 线程同步：使用synchronized关键字修饰
		
		1.同步方法：使用synchronized修饰方法
				//同步方法，粒度粗
				public synchronized void run() {
					
				}
		
			类锁：synchronized修饰static的方法，例如：
					public static synchronized void run() {},基于当前类，一次只能被一个线程访问
					
		            对象锁：synchronized修饰非static的方法，例如：
		            public synchronized void run() {},基于当前对象，一次只能被一个线程访问
		            
		2.同步语句：使用synchronized修饰代码块
			   //同步语句，粒度细
			   synchronized (this) {
			   
			   }
			   
			 类锁（RunnableTicket.class）、对象锁（this）、任意锁（"a","b"）
 */
public class RunnableTicket implements Runnable{

	private int num = 50;

	//同步语句，粒度细
	@Override
	public void run() {
		while(num > 0)
		{
			// 1   杰成     2 国威---------------排队
			synchronized (this) {
				//加一层判断，判断当前是否还有余票
				if(num > 0)
				{
					System.out.println("售票员 【" + Thread.currentThread().getName() + "】，售出了票NO." + num);
					num--;
				}
			}
			
			//Thread休眠一秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//同步方法，粒度粗
	//@Override
	public synchronized void run1() {
		while(num > 0)
		{
			System.out.println("售票员 【" + Thread.currentThread().getName() + "】，售出了票NO." + num);
			num--;
		}
	}
}
