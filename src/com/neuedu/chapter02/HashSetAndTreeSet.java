package com.neuedu.chapter02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetAndTreeSet {

	public static void main(String[] args) {
		/**
		 	HashSet:��ײ� HashMap
				1.�������Ԫ�ص�˳�����ڴ��д洢��˳��һ��
				2.�������ظ���ʹ��equals()���ƽ��бȽ�
				3.����nullֵ
				4.�洢�ṹ����ϣ�洢
				5.����ֻ����洢�������Ͷ��󣬵��ǻ����������Ϳ����Զ�װ��
				6.HashSet��Ч��   > TreeSet��Ч��
		 */
		//����һ���µĿ� set����ײ� HashMap ʵ����Ĭ�ϳ�ʼ������ 16������������ 0.75
		HashSet hashSet = new HashSet();
		hashSet.add(null);
		hashSet.add(null);                   //���ų�
		hashSet.add("abc");
		hashSet.add(new String("abc"));      //���ų�
		hashSet.add(10);   //�Զ�װ��  �������� -> ��װ��Integer
		hashSet.add(true); //�Զ�װ��  �������� -> ��װ��Boolean
		
		//System.out.println(hashSet);//[null, abc, true, 10]
		
		/**
		 * TreeSet:��ײ� TreeMap
				1.�������Ԫ�ص�˳�����ڴ��д洢��˳��һ�£����ǻ����Ԫ�ص���Ȼ˳��������Ҫʹ��Comparable�ӿ��е�compareTo()�������������Ƚϣ����뱣֤Ԫ������һ��
				2.�������ظ���ʹ��equals()���ƽ��бȽ�
				3.������nullֵ: ��Ϊ��Ҫʹ��Comparable�ӿ��е�compareTo()�������������Ƚϣ���null���ܵ����κη���
				4.�洢�ṹ���������ṹ���򣨺������
				5.����ֻ����洢�������Ͷ��󣬵��ǻ����������Ϳ����Զ�װ��
		 */
		//����һ���µĿ� set���� set ������Ԫ�ص���Ȼ˳���������
		TreeSet treeSet = new TreeSet();
		//treeSet.add(null);                   //java.lang.NullPointerException ֵ������Ϊnull
		treeSet.add(97);
		treeSet.add(88);
		treeSet.add(2);
		treeSet.add(123);
		treeSet.add(865);
		treeSet.add(88);
		
		System.out.println(treeSet);//[2, 88, 97, 123, 865]

		/**
		 * ������for����Ϊ���򣬲���ʹ���±���з���
		 */
		for (int i = 0; i < treeSet.size(); i++) {
			
		}
		
		/**
		 * ������forEach
		 */
		for (Object element : treeSet) {
			System.out.println(element);
		}
		
		System.out.println("----------------------");
		
		/**
		 * ������������iterator
		 */
		Iterator iterator = treeSet.iterator();
		while(iterator.hasNext())
		{
			//Object element = iterator.next();
			System.out.println(iterator.next());
		}
	}
	
}
