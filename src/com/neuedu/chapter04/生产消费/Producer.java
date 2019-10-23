package com.neuedu.chapter04.��������;

//������
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
			synchronized (store) {//�����ǰ�̲߳��Ǵ˶���������������ߣ����׳�IllegalMonitorStateException
				
				//����ǰ���� == ���������ֹͣ�������ȴ�����������
				while(store.count >= store.MAX_COUNT)//Ϊ�˱�����ٻ��ѣ���Ҫʹ��if�жϣ�ʹ��whileѭ���ж�
				{
					try {
						store.wait();//���µ�ǰ���̵߳ȴ���ֱ�������̵߳��ô�store����� notify()������ notifyAll() ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//���
				store.in();
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
