package com.neuedu.chapter04.��������;

//������
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
			synchronized (store) {//�����ǰ�̲߳��Ǵ˶���������������ߣ����׳�IllegalMonitorStateException
				
				//���ֿ�ĵ�ǰ���� == 0�ǣ�ֹͣ���ѣ��ȴ������߽�������
				while(store.count <= 0)//Ϊ�˱�����ٻ��ѣ���Ҫʹ��if�жϣ�ʹ��whileѭ���ж�
				{
					try {
						store.wait();//���µ�ǰ���̵߳ȴ���ֱ�������̵߳��ô�store����� notify()������ notifyAll() ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//����
				store.out();
				//���������߽�������
				store.notify();
				
				//����һ��
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
