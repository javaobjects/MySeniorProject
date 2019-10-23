package com.neuedu.chapter04.��ֹ�߳�;

/**
 *  1. �Զ���ֹ �� һ���߳����ִ�к󣬲����ٴ����� 
	2. �ֶ���ֹ
		  �� stop( ) ���� �ѹ�ʱ����������
		  �� interrupt( ) ���� �ֱ�����ֹ��ʽ
		  �� ��ͨ��ʹ��һ����־ָʾ run �����˳����Ӷ���ֹ�߳�
 */
public class StopThreadDemo {

	public static void main(String[] args) {
		Thread5 t1 = new Thread5();
		t1.start();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			
			//����������ֹ�߳�
			if(i%5 ==0)
			{
				t1.setFlag(false);//------------------��ֹ�߳�
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
