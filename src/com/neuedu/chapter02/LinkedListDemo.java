package com.neuedu.chapter02;

import java.util.LinkedList;

public class LinkedListDemo {
	/**
		LinkedList:
			1.有序：添加元素的顺序与内存中存储的顺序一致
			2.允许重复
			3.允许null值
			4.存储结构：链表存储，查询效率较低，但新增与删除效率较高
			5.集合只允许存储引用类型对象，但是基本数据类型可以自动装箱
			6.LinkedList的方法 > ArrayList的方法
	 */
	public static void main(String[] args) {
		
		/**
		 * 1.创建对象
		 */
		//构造一个空列
		LinkedList list = new LinkedList();
		list.add(null);
		list.add(null);
		list.add("abc");
		list.add(new String("abc"));
		list.add(10);   //自动装箱  基本类型 -> 包装类Integer
		list.add(true); //自动装箱  基本类型 -> 包装类Boolean
		
		System.out.println(list);//[null, null, abc, abc, 10, true]
		
		/**
		 * 2.特有的方法：针对首尾元素进行新增、删除、获取等
		 */
		//addFirst() 将元素添加到第一位
		list.addFirst("首部");
		System.out.println(list);//[首部, null, null, abc, abc, 10, true]

		//addLast() 将元素添加到最后一位
		list.addLast("尾部");
		System.out.println(list);//[首部, null, null, abc, abc, 10, true, 尾部]
		
		//getFirst() 获取第一个元素
		System.out.println(list.getFirst());//首部
		
		//getLast() 获取最后一个元素
		System.out.println(list.getLast());//尾部
		
		//removeFirst()  删除并返回第一个元素
		System.out.println(list.removeFirst());//首部
		System.out.println(list);//[null, null, abc, abc, 10, true, 尾部]
		
		//removeLast()  删除并返回最后一个元素
		System.out.println(list.removeLast());//尾部
		System.out.println(list); //[null, null, abc, abc, 10, true]
		
	}
}
