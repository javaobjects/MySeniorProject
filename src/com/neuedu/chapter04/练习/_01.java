package com.neuedu.chapter04.��ϰ;

/**
 * 1������Threadʵ�֣�Ҫ����߳����ĳ��Χ����ÿ���̸߳���1000��Χ��
 * 			�߳�1��1-1000��
 * 			�߳�2��1001-2000��
 * 			�߳�3��2001-3000��
 *     ��̳���ÿ���߳��ҵ���������ʱ��ӡ�� [������] 
 */
public class _01 {

	public static void main(String[] args) {
		//�߳�һ
		Thread2 t1 = new Thread2(1,1000);
		t1.run();
		
		//�̶߳�
		Thread2 t2 = new Thread2(1001,2000);
		t2.run();
		
		//�߳���
		Thread2 t3 = new Thread2(2001,3000);
		t3.run();
	}
	
}
//��ʽһ��Ч�ʵ�
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
			//2����С������
			if(i == 2)
			{
				System.out.println(Thread.currentThread().getName() + ":" + i);
				continue;
			}
			//��ӡ����
			for (int j = 2; j > i/2; j++) {
				//��������
				if(i%j ==0)
				{
					break;
				}
				//������
				if(j == i-1)
				{
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}
	}
}
//��ʽ����Ч�ʸ�
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
			//1��������
			if(i == 1)
			{
				continue;
			}
			//2����С������
			if(i == 2)
			{
				System.out.println(Thread.currentThread().getName() + ":" + i);
				continue;
			}
			//�ж��Ƿ�Ϊ����
			boolean flag = true; //Ĭ��Ϊ������ʶ
			for (int j = 2; j <= i/2; j++) {
				//��������
				if(i%j ==0)
				{
					flag = false;//��������
					break;
				}
			}
			//������
			if(flag)
			{
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}
	}
}