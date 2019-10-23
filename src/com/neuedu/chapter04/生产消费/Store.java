package com.neuedu.chapter04.生产消费;

//仓库
public class Store {

	//最大容量
	final int MAX_COUNT = 5;
	
	//当前容量
	int count;
	
	//入库
	public void in()
	{
		System.out.println("入库前库存：" + count);
		count++;
		System.out.println("入库后库存：" + count);
	}
	
	//出库
	public void out()
	{
		System.out.println("出库前库存：" + count);
		count--;
		System.out.println("出库后库存：" + count);
	}
}
