package com.neuedu.chapter02.练习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 1、请使用LinkedList来模拟一个队列(先进先出的特性): [必做题]
		1.1 拥有放入对象的方法void put(Object o)
		1.2 取出对象的方法Object get()
		1.3 判断队列当中是否为空的方法boolean isEmpty()；
		
		并且，编写测试代码，验证你的队列是否正确。
 */
public class Queue {
	LinkedList list = new LinkedList();

	//1.1 拥有放入对象的方法void put(Object o)
	public void put(Object o)
	{
		list.addLast(o);
	}
	
	//1.2 取出对象的方法Object get()
	public Object get()
	{
		return list.removeFirst();
	}
	
	//1.3 判断队列当中是否为空的方法boolean isEmpty()；
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	//并且，编写测试代码，验证你的队列是否正确。
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		//存值
		queue.put(1);
		queue.put(2);
		queue.put(3);
		queue.put(4);
		queue.put(5);
		
		//取值
		/*System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());*/
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.get());
		}
	}
}
