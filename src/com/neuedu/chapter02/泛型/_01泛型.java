package com.neuedu.chapter02.����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class _01���� {

	public static void main(String[] args) {
		/**
		 * û��ʹ�÷��ͣ�
		 * 		1.�����п�������������͵�Ԫ��
		 * 		2.���»�ȡԪ��ʱ��ֻ����ʹ��Object�����գ������Ҫת��ΪԪ�ص�ԭʼ���ͣ���Ҫǿ��ת��
		 * 		3.���׳������ʹ���
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
		 * ʹ�÷��ͣ�
		 * 		1.������ָ�����Ԫ�ص�����
		 * 	    2.������ȡԪ��ʱ������Ҫ��ǿ��ת��
		 * 
		 * 		Լ��������ֻ�������String���͵�Ԫ�أ�
  					ArrayList<String> list = new ArrayList<String>();
  					
		 * 		Լ��������ֻ�������Integer���͵�Ԫ�أ�
  					ArrayList<Integer> list = new ArrayList<Integer>();

		 * 		Լ��������keyΪInteger���ͣ�valueΪString���ͣ�
  					HashMap<Integer,String> map = new HashMap<Integer,String>();

		 */
		//Լ��������ֻ�������String���͵�Ԫ�أ�
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		//list2.add(10);
		list2.add("d");
		list2.add("e");
		list2.add("f");
		
		for (String element : list2) {
			System.out.println(element);
		}
		
		//Լ��������keyΪInteger���ͣ�valueΪString���ͣ�
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "����");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key +"  " + value);
		}
	}
	/**
	 * ��ȡָ�������ԭʼ����
	 * @param object
	 */
	private static void getType(Object object) {
		if(object instanceof String)
		{
			String str = (String)object;
			System.out.println(str + "��һ��String");
		}
		else if(object instanceof Integer)
		{
			Integer inte = (Integer)object;
			System.out.println(inte + "��һ��Integer");
		}
		else if(object instanceof Boolean)
		{
			Boolean bool = (Boolean)object;
			System.out.println(bool + "��һ��Boolean");
		}
		else
		{
			System.out.println(object + "��һ��δʶ�������");
		}
	}
	
}
