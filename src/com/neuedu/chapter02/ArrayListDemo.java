package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	/**
		ArrayList:
			1.有序：添加元素的顺序与内存中存储的顺序一致
			2.允许重复
			3.允许null值
			4.存储结构：线性存储，查询效率较高，但新增与删除效率较低
			5.集合只允许存储引用类型对象，但是基本数据类型可以自动装箱
	 */
	public static void main(String[] args) {
		/**
		 * 1.创建对象
		 */
		//构造一个初始容量为 10 的空列表
		ArrayList list = new ArrayList();
		list.add(null);
		list.add(null);
		list.add("abc");
		list.add(new String("abc"));
		list.add(10);   //自动装箱  基本类型 -> 包装类Integer
		list.add(true); //自动装箱  基本类型 -> 包装类Boolean
		
		System.out.println(list.toString());//[null, null, abc, abc, 10, true] 重写父类toString()
		
		/**
		 * 2.常用方法
		 */
		//add(index,element) 新增元素
		list.add(0, "新增");
		System.out.println(list); //[新增, null, null, abc, abc, 10, true]
		
		//clear() 移除所有的元素
		//list.clear();
		System.out.println(list);
		
		//size() 获取集合元素个数
		System.out.println(list.size());
		
		//contains() 判断是否包含指定元素
		System.out.println(list.contains("abc"));//true
		System.out.println(list.contains(123));  //false
		
		//get(index) 通过index下标获取指定元素值
		//System.out.println(list.get(0));//新增
		
		//indexOf(obj) 查找指定元素的下标---从左往右查找
		System.out.println(list.indexOf("abc"));//3
		
		//lastIndexOf(obj) 查找指定元素的下标---从右往左查找
		System.out.println(list.lastIndexOf("abc"));//4
		
		//isEmpty() 判断集合是否存在元素
		System.out.println(list.isEmpty());
		
		//remove(index) 根据下标删除并且返回删除的元素
		System.out.println("删除的元素是：" + list.remove(1));//null
		System.out.println(list); //[新增, null, abc, abc, 10, true]
		
		//remove(obj) 删除指定的元素
		System.out.println("删除是否成功：" + list.remove(null));
		System.out.println(list);//[新增, abc, abc, 10, true]
		
		//set(index,element) 在指定index下标位置，使用element进行替换
		list.set(0, "add");
		System.out.println(list);//[add, abc, abc, 10, true]
		
		/**
		 * toArray() 集合 -> 数组
		 */
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		
		/**
		 * 遍历数组：for----------------------------------数组访问：-----【数组长度】：array.length-------【数组取值】：array[i]
		 */
		for (int i = 0; i < array.length; i++) {
			
			Object element = array[i];
			
			System.out.println(element);
		}
		System.out.println("--------------------------------");
		
		/**
		 * 遍历数组：forEach
		 */
		for (Object element : array) {
			System.out.println(element);
		}
		
		System.out.println("--------------------------------");
		
		/**
		 * 直接遍历集合：for----------------------------------集合访问：-----【集合长度】：list.size()------【集合取值】：list.get(i)
		 */
		for (int i = 0; i < list.size(); i++) {
			
			Object element = list.get(i);
			
			System.out.println(element);
		}
		
		System.out.println("--------------------------------");

		
		/**
		 * 直接遍历集合：forEach
		 */
		for (Object element : list) {
			System.out.println(element);
		}
		
		System.out.println("--------------------------------");

		/**
		 * 迭代器遍历集合：Iterator
		 */
		Iterator iterator = list.iterator();
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  ");//返回false，说明已无元素可取
		while(iterator.hasNext())
		{
			Object element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("--------------------------------");
		
		/**
		 * 迭代器遍历集合：ListIterator
		 */
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext())
		{
			Object element = listIterator.next();
			
			System.out.println(element);
		}
	}
}
