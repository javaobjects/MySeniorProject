package com.neuedu.chapter04.���÷���;

/**
 * join:���µ�ǰ�̵߳ȴ���ֱ�����ø÷���֮ǰ�������߳�ִ�н���
 */
public class JoinDemo {

	public static void main(String[] args) {
		Thread4 t1 = new Thread4(1,10);
		t1.start();
		
		Thread4 t2 = new Thread4(11,20);
		t2.start();
		
		try {
			t2.join();//��t2��ӣ���t2֮ǰ�������߳���ִ����ɣ������Ĵ���ſ��Լ���ִ��
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
