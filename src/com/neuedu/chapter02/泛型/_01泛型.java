package com.neuedu.chapter02.泛型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class _01泛型 {

	public static void main(String[] args) {
		/**
		 * 没有使用泛型：
		 * 		1.集合中可以添加任意类型的元素
		 * 		2.导致获取元素时，只允许使用Object来接收，如果需要转换为元素的原始类型，需要强制转换
		 * 		3.容易出现造型错误
		 */
		ArrayList list = new ArrayList();
		list.add(null);
		list.add(null);
		list.add("abc");
		list.add(new String("abc"));
		list.add(10);  
		list.add(true);
		
		for (Object object : list) {
			//System.out.println(object);
			getType(object);
		}
		
		/**
		 * 使用泛型：
		 * 		1.集合中指定添加元素的类型
		 * 	    2.遍历获取元素时，不需要再强制转换
		 * 
		 * 		约束集合中只允许添加String类型的元素：
  					ArrayList<String> list = new ArrayList<String>();
  					
		 * 		约束集合中只允许添加Integer类型的元素：
  					ArrayList<Integer> list = new ArrayList<Integer>();

		 * 		约束集合中key为Integer类型，value为String类型：
  					HashMap<Integer,String> map = new HashMap<Integer,String>();

		 */
		//约束集合中只允许添加String类型的元素：
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		//list2.add(10);
		list2.add("d");
		list2.add("e");
		list2.add("f");
		
		for (String element : list2) {
			System.out.println(element);
		}
		
		//约束集合中key为Integer类型，value为String类型：
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "张三");
		map.put(2, "李四");
		map.put(3, "王五");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key +"  " + value);
		}
	}
	/**
	 * 获取指定对象的原始类型
	 * @param object
	 */
	private static void getType(Object object) {
		if(object instanceof String)
		{
			String str = (String)object;
			System.out.println(str + "是一个String");
		}
		else if(object instanceof Integer)
		{
			Integer inte = (Integer)object;
			System.out.println(inte + "是一个Integer");
		}
		else if(object instanceof Boolean)
		{
			Boolean bool = (Boolean)object;
			System.out.println(bool + "是一个Boolean");
		}
		else
		{
			System.out.println(object + "是一个未识别的类型");
		}
	}
	
}
