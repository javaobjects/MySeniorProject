package com.neuedu.chapter04.��������;

public class Test {

	public static void main(String[] args) {
		//����һ���ֿ�
		Store store = new Store();
		
		//������
		Producer producer = new Producer(store);
		producer.start();
		
		//������
		Customer customer = new Customer(store);
		customer.start();
		
		Customer customer2 = new Customer(store);
		customer2.start();
		
	}

}
