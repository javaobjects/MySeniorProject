package com.neuedu.chapter02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		/**
		 	 HashMap：键值对存值
		 	 
				1.无序：添加元素的顺序与内存中存储的顺序不一致
				2.是否允许重复：key值一般不允许重复（唯一性），value值可以重复
				3.允许null值
				4.存储结构：哈希存储
				5.集合只允许存储引用类型对象，但是基本数据类型可以自动装箱
				6.HashMap的效率   > TreeMap的效率
		 */
		//构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap
		HashMap map = new HashMap();
		map.put(null, null); //被覆盖
		map.put(null, "123");
		map.put(1, "张三");
		map.put(true, 'a');
		map.put(2, "李四");
		map.put(3, "123");
		
		System.out.println(map);//{null=123, 1=张三, 2=李四, 3=123, true=a}

		//clear() 清除键值对
		//map.clear();
		System.out.println(map);//{}

		//isEmpty() 判断是否为空
		System.out.println(map.isEmpty());//true
		 
		//size() 获取键值对的个数
		System.out.println(map.size());//5
		
		//containsKey(key) 判断是否包含指定key
		System.out.println(map.containsKey(1));//true
		
		//containsValue(value) 判断是否包含指定value
		System.out.println(map.containsValue("张三"));//true
		
		//get(key) 通过key获取value值
		System.out.println(map.get(2));//李四
		
		//remove(key) 根据指定的key移除键值对
		map.remove(null);
		System.out.println(map);//{1=张三, 2=李四, 3=123, true=a}

		/**
		 * 遍历
		 */
		//values() ------------获取所有【值】的视图
		Collection values = map.values();
		for (Object value : values) {
			System.out.println("值：" + value);
		}
		
		System.out.println("----------------------");
		
		//keySet()------------获取所有【键】的视图
		Set keys = map.keySet();
		for (Object key : keys) {
			
			//根据key获取value
			Object value = map.get(key);
			
			System.out.println("键：" + key + "  值：" + value);
		}
		
		System.out.println("----------------------");
		
		//enrtySet()------------获取所有【键-值】的视图
		Set keyValues = map.entrySet();
		for (Object keyValue : keyValues) {
			Entry entry = (Entry)keyValue;
			
			Object key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println("键：" + key + "  值：" + value);

		}
	}
}
