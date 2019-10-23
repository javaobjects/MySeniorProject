package com.neuedu.chapter04.常用方法;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * sleep:让当前线程休眠指定毫秒值
 */
public class SleepDemo {

	public static void main(String[] args) {
		Thread3 t1 = new Thread3();
		t1.start();
	}
}

class Thread3  extends Thread
{
	@Override
	public void run() {
		while(true)
		{
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			
			//休眠一秒,毫秒为单位
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
