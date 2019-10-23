package com.neuedu.chapter02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetAndTreeSet {

	public static void main(String[] args) {
		/**
		 	HashSet:其底层 HashMap
				1.无序：添加元素的顺序与内存中存储的顺序不一致
				2.不允许重复：使用equals()机制进行比较
				3.允许null值
				4.存储结构：哈希存储
				5.集合只允许存储引用类型对象，但是基本数据类型可以自动装箱
				6.HashSet的效率   > TreeSet的效率
		 */
		//构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75
		HashSet hashSet = new HashSet();
		hashSet.add(null);
		hashSet.add(null);                   //被排除
		hashSet.add("abc");
		hashSet.add(new String("abc"));      //被排除
		hashSet.add(10);   //自动装箱  基本类型 -> 包装类Integer
		hashSet.add(true); //自动装箱  基本类型 -> 包装类Boolean
		
		//System.out.println(hashSet);//[null, abc, true, 10]
		
		/**
		 * TreeSet:其底层 TreeMap
				1.无序：添加元素的顺序与内存中存储的顺序不一致，但是会根据元素的自然顺序排序，需要使用Comparable接口中的compareTo()方法进行两两比较，必须保证元素类型一致
				2.不允许重复：使用equals()机制进行比较
				3.不允许null值: 因为需要使用Comparable接口中的compareTo()方法进行两两比较，而null不能调用任何方法
				4.存储结构：二叉树结构排序（红黑树）
				5.集合只允许存储引用类型对象，但是基本数据类型可以自动装箱
		 */
		//构造一个新的空 set，该 set 根据其元素的自然顺序进行排序
		TreeSet treeSet = new TreeSet();
		//treeSet.add(null);                   //java.lang.NullPointerException 值不允许为null
		treeSet.add(97);
		treeSet.add(88);
		treeSet.add(2);
		treeSet.add(123);
		treeSet.add(865);
		treeSet.add(88);
		
		System.out.println(treeSet);//[2, 88, 97, 123, 865]

		/**
		 * 遍历：for，因为无序，不能使用下标进行访问
		 */
		for (int i = 0; i < treeSet.size(); i++) {
			
		}
		
		/**
		 * 遍历：forEach
		 */
		for (Object element : treeSet) {
			System.out.println(element);
		}
		
		System.out.println("----------------------");
		
		/**
		 * 迭代器遍历：iterator
		 */
		Iterator iterator = treeSet.iterator();
		while(iterator.hasNext())
		{
			//Object element = iterator.next();
			System.out.println(iterator.next());
		}
	}
	
}
