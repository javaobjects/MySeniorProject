package com.neuedu.chapter04.生产消费;

//消费者
public class Customer extends Thread {

	private Store store;
	
	public Customer(Store store)
	{
		this.store = store;
	}
	
	@Override
	public void run() {
		while(true)
		{
			synchronized (store) {//如果当前线程不是此对象监视器的所有者，则抛出IllegalMonitorStateException
				
				//当仓库的当前容量 == 0是，停止消费，等待生产者进行生产
				while(store.count <= 0)//为了避免虚假唤醒，不要使用if判断，使用while循环判断
				{
					try {
						store.wait();//导致当前的线程等待，直到其他线程调用此store对象的 notify()方法或 notifyAll() 方法
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//出库
				store.out();
				//唤醒生产者进行生产
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
