package com.neuedu.chapter04.售票;

public class TicketTest {

	public static void main(String[] args) {
		/**
		 * 继承Thread：不能实现数据共享，因为每new一次对象，生成一个新的num保存在堆内存中，且只能单继承
		 */
		/*//售票员一号
		ThreadTicket t1 = new ThreadTicket();
		t1.setName("杨国");
		t1.start();
		
		//售票员二号
		ThreadTicket t2 = new ThreadTicket();
		t2.setName("陆嘉琛");
		t2.start();*/
		
		/**
		 * 实现Runnable接口:可以共享数据，RunnableTicket仅new一次，num在内存中仅存在一份，共享给t3与t4一起使用，支持多实现
		 */
		RunnableTicket ticket = new RunnableTicket();
		
		//售票员三号
		Thread t3 = new Thread(ticket);
		t3.setName("杰成");
		t3.start();
		
		//售票员四号
		Thread t4 = new Thread(ticket);
		t4.setName("国威");
		t4.start();
		
		RunnableTicket ticket2 = new RunnableTicket();
		
		//售票员三号
		Thread t5 = new Thread(ticket2);
		t5.setName("杰成2");
		t5.start();
		
		//售票员四号
		Thread t6 = new Thread(ticket2);
		t6.setName("国威2");
		t6.start();
		
		
	}

}
