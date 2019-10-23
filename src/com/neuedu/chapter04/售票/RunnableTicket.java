package com.neuedu.chapter04.��Ʊ;

/**
 * �߳�ͬ����ʹ��synchronized�ؼ�������
		
		1.ͬ��������ʹ��synchronized���η���
				//ͬ�����������ȴ�
				public synchronized void run() {
					
				}
		
			������synchronized����static�ķ��������磺
					public static synchronized void run() {},���ڵ�ǰ�࣬һ��ֻ�ܱ�һ���̷߳���
					
		            ��������synchronized���η�static�ķ��������磺
		            public synchronized void run() {},���ڵ�ǰ����һ��ֻ�ܱ�һ���̷߳���
		            
		2.ͬ����䣺ʹ��synchronized���δ����
			   //ͬ����䣬����ϸ
			   synchronized (this) {
			   
			   }
			   
			 ������RunnableTicket.class������������this������������"a","b"��
 */
public class RunnableTicket implements Runnable{

	private int num = 50;

	//ͬ����䣬����ϸ
	@Override
	public void run() {
		while(num > 0)
		{
			// 1   �ܳ�     2 ����---------------�Ŷ�
			synchronized (this) {
				//��һ���жϣ��жϵ�ǰ�Ƿ�����Ʊ
				if(num > 0)
				{
					System.out.println("��ƱԱ ��" + Thread.currentThread().getName() + "�����۳���ƱNO." + num);
					num--;
				}
			}
			
			//Thread����һ��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//ͬ�����������ȴ�
	//@Override
	public synchronized void run1() {
		while(num > 0)
		{
			System.out.println("��ƱԱ ��" + Thread.currentThread().getName() + "�����۳���ƱNO." + num);
			num--;
		}
	}
}
