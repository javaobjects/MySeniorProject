package com.neuedu.chapter02.��ϰ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 1����ʹ��LinkedList��ģ��һ������(�Ƚ��ȳ�������): [������]
		1.1 ӵ�з������ķ���void put(Object o)
		1.2 ȡ������ķ���Object get()
		1.3 �ж϶��е����Ƿ�Ϊ�յķ���boolean isEmpty()��
		
		���ң���д���Դ��룬��֤��Ķ����Ƿ���ȷ��
 */
public class Queue {
	LinkedList list = new LinkedList();

	//1.1 ӵ�з������ķ���void put(Object o)
	public void put(Object o)
	{
		list.addLast(o);
	}
	
	//1.2 ȡ������ķ���Object get()
	public Object get()
	{
		return list.removeFirst();
	}
	
	//1.3 �ж϶��е����Ƿ�Ϊ�յķ���boolean isEmpty()��
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	//���ң���д���Դ��룬��֤��Ķ����Ƿ���ȷ��
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		//��ֵ
		queue.put(1);
		queue.put(2);
		queue.put(3);
		queue.put(4);
		queue.put(5);
		
		//ȡֵ
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
