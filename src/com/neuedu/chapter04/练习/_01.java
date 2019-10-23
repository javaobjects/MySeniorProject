package com.neuedu.chapter04.练习;

/**
 * 1、利用Thread实现，要求多线程求解某范围素数每个线程负责1000范围：
 * 			线程1找1-1000；
 * 			线程2找1001-2000；
 * 			线程3找2001-3000。
 *     编程程序将每个线程找到的素数及时打印。 [必做题] 
 */
public class _01 {

	public static void main(String[] args) {
		//线程一
		Thread2 t1 = new Thread2(1,1000);
		t1.run();
		
		//线程二
		Thread2 t2 = new Thread2(1001,2000);
		t2.run();
		
		//线程三
		Thread2 t3 = new Thread2(2001,3000);
		t3.run();
	}
	
}
//方式一：效率低
class Thread1 extends Thread{

	private int begin;
	private int end;
	
	public Thread1(int begin,int end)
	{
		this.begin = begin;
		this.end = end;
	}
	
	@Override
	public void run() {
		for (int i = begin; i <= end; i++) {
			//2是最小的素数
			if(i == 2)
			{
				System.out.println(Thread.currentThread().getName() + ":" + i);
				continue;
			}
			//打印素数
			for (int j = 2; j > i/2; j++) {
				//不是素数
				if(i%j ==0)
				{
					break;
				}
				//是素数
				if(j == i-1)
				{
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}
	}
}
//方式二：效率高
class Thread2 extends Thread{

	private int begin;
	private int end;
	
	public Thread2(int begin,int end)
	{
		this.begin = begin;
		this.end = end;
	}
	
	@Override
	public void run() {
		for (int i = begin; i <= end; i++) {
			//1不是素数
			if(i == 1)
			{
				continue;
			}
			//2是最小的素数
			if(i == 2)
			{
				System.out.println(Thread.currentThread().getName() + ":" + i);
				continue;
			}
			//判断是否为素数
			boolean flag = true; //默认为素数标识
			for (int j = 2; j <= i/2; j++) {
				//不是素数
				if(i%j ==0)
				{
					flag = false;//不是素数
					break;
				}
			}
			//是素数
			if(flag)
			{
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}
	}
}