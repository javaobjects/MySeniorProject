package com.neuedu.chapter04.��Ʊ;

public class TicketTest {

	public static void main(String[] args) {
		/**
		 * �̳�Thread������ʵ�����ݹ�����Ϊÿnewһ�ζ�������һ���µ�num�����ڶ��ڴ��У���ֻ�ܵ��̳�
		 */
		/*//��ƱԱһ��
		ThreadTicket t1 = new ThreadTicket();
		t1.setName("���");
		t1.start();
		
		//��ƱԱ����
		ThreadTicket t2 = new ThreadTicket();
		t2.setName("½���");
		t2.start();*/
		
		/**
		 * ʵ��Runnable�ӿ�:���Թ������ݣ�RunnableTicket��newһ�Σ�num���ڴ��н�����һ�ݣ������t3��t4һ��ʹ�ã�֧�ֶ�ʵ��
		 */
		RunnableTicket ticket = new RunnableTicket();
		
		//��ƱԱ����
		Thread t3 = new Thread(ticket);
		t3.setName("�ܳ�");
		t3.start();
		
		//��ƱԱ�ĺ�
		Thread t4 = new Thread(ticket);
		t4.setName("����");
		t4.start();
		
		RunnableTicket ticket2 = new RunnableTicket();
		
		//��ƱԱ����
		Thread t5 = new Thread(ticket2);
		t5.setName("�ܳ�2");
		t5.start();
		
		//��ƱԱ�ĺ�
		Thread t6 = new Thread(ticket2);
		t6.setName("����2");
		t6.start();
		
		
	}

}
