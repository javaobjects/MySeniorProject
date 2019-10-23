package com.neuedu.chapter04.生产消费;

//生产者
public class Producer extends Thread {

	private Store store;
	
	public Producer(Store store)
	{
		this.store = store;
	}
	
	@Override
	public void run() {
		while(true)
		{
			synchronized (store) {//如果当前线程不是此对象监视器的所有者，则抛出IllegalMonitorStateException
				
				//当当前容量 == 最大容量，停止生产，等待消费者消费
				while(store.count >= store.MAX_COUNT)//为了避免虚假唤醒，不要使用if判断，使用while循环判断
				{
					try {
						store.wait();//导致当前的线程等待，直到其他线程调用此store对象的 notify()方法或 notifyAll() 方法
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//入库
				store.in();
				//唤醒消费者进行消费
				store.notify();
				
				//休眠一秒
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
