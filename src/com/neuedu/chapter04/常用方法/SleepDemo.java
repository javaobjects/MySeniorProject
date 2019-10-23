package com.neuedu.chapter04.���÷���;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * sleep:�õ�ǰ�߳�����ָ������ֵ
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
			
			//����һ��,����Ϊ��λ
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
