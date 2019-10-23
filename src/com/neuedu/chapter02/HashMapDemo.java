package com.neuedu.chapter02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		/**
		 	 HashMap����ֵ�Դ�ֵ
		 	 
				1.�������Ԫ�ص�˳�����ڴ��д洢��˳��һ��
				2.�Ƿ������ظ���keyֵһ�㲻�����ظ���Ψһ�ԣ���valueֵ�����ظ�
				3.����nullֵ
				4.�洢�ṹ����ϣ�洢
				5.����ֻ����洢�������Ͷ��󣬵��ǻ����������Ϳ����Զ�װ��
				6.HashMap��Ч��   > TreeMap��Ч��
		 */
		//����һ������Ĭ�ϳ�ʼ���� (16) ��Ĭ�ϼ������� (0.75) �Ŀ� HashMap
		HashMap map = new HashMap();
		map.put(null, null); //������
		map.put(null, "123");
		map.put(1, "����");
		map.put(true, 'a');
		map.put(2, "����");
		map.put(3, "123");
		
		System.out.println(map);//{null=123, 1=����, 2=����, 3=123, true=a}

		//clear() �����ֵ��
		//map.clear();
		System.out.println(map);//{}

		//isEmpty() �ж��Ƿ�Ϊ��
		System.out.println(map.isEmpty());//true
		 
		//size() ��ȡ��ֵ�Եĸ���
		System.out.println(map.size());//5
		
		//containsKey(key) �ж��Ƿ����ָ��key
		System.out.println(map.containsKey(1));//true
		
		//containsValue(value) �ж��Ƿ����ָ��value
		System.out.println(map.containsValue("����"));//true
		
		//get(key) ͨ��key��ȡvalueֵ
		System.out.println(map.get(2));//����
		
		//remove(key) ����ָ����key�Ƴ���ֵ��
		map.remove(null);
		System.out.println(map);//{1=����, 2=����, 3=123, true=a}

		/**
		 * ����
		 */
		//values() ------------��ȡ���С�ֵ������ͼ
		Collection values = map.values();
		for (Object value : values) {
			System.out.println("ֵ��" + value);
		}
		
		System.out.println("----------------------");
		
		//keySet()------------��ȡ���С���������ͼ
		Set keys = map.keySet();
		for (Object key : keys) {
			
			//����key��ȡvalue
			Object value = map.get(key);
			
			System.out.println("����" + key + "  ֵ��" + value);
		}
		
		System.out.println("----------------------");
		
		//enrtySet()------------��ȡ���С���-ֵ������ͼ
		Set keyValues = map.entrySet();
		for (Object keyValue : keyValues) {
			Entry entry = (Entry)keyValue;
			
			Object key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println("����" + key + "  ֵ��" + value);

		}
	}
}
