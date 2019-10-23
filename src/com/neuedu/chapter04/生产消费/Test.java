package com.neuedu.chapter04.生产消费;

public class Test {

	public static void main(String[] args) {
		//创建一个仓库
		Store store = new Store();
		
		//生产者
		Producer producer = new Producer(store);
		producer.start();
		
		//消费者
		Customer customer = new Customer(store);
		customer.start();
		
		Customer customer2 = new Customer(store);
		customer2.start();
		
	}

}
