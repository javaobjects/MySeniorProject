package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	/**
		ArrayList:
			1.�������Ԫ�ص�˳�����ڴ��д洢��˳��һ��
			2.�����ظ�
			3.����nullֵ
			4.�洢�ṹ�����Դ洢����ѯЧ�ʽϸߣ���������ɾ��Ч�ʽϵ�
			5.����ֻ����洢�������Ͷ��󣬵��ǻ����������Ϳ����Զ�װ��
	 */
	public static void main(String[] args) {
		/**
		 * 1.��������
		 */
		//����һ����ʼ����Ϊ 10 �Ŀ��б�
		ArrayList list = new ArrayList();
		list.add(null);
		list.add(null);
		list.add("abc");
		list.add(new String("abc"));
		list.add(10);   //�Զ�װ��  �������� -> ��װ��Integer
		list.add(true); //�Զ�װ��  �������� -> ��װ��Boolean
		
		System.out.println(list.toString());//[null, null, abc, abc, 10, true] ��д����toString()
		
		/**
		 * 2.���÷���
		 */
		//add(index,element) ����Ԫ��
		list.add(0, "����");
		System.out.println(list); //[����, null, null, abc, abc, 10, true]
		
		//clear() �Ƴ����е�Ԫ��
		//list.clear();
		System.out.println(list);
		
		//size() ��ȡ����Ԫ�ظ���
		System.out.println(list.size());
		
		//contains() �ж��Ƿ����ָ��Ԫ��
		System.out.println(list.contains("abc"));//true
		System.out.println(list.contains(123));  //false
		
		//get(index) ͨ��index�±��ȡָ��Ԫ��ֵ
		//System.out.println(list.get(0));//����
		
		//indexOf(obj) ����ָ��Ԫ�ص��±�---�������Ҳ���
		System.out.println(list.indexOf("abc"));//3
		
		//lastIndexOf(obj) ����ָ��Ԫ�ص��±�---�����������
		System.out.println(list.lastIndexOf("abc"));//4
		
		//isEmpty() �жϼ����Ƿ����Ԫ��
		System.out.println(list.isEmpty());
		
		//remove(index) �����±�ɾ�����ҷ���ɾ����Ԫ��
		System.out.println("ɾ����Ԫ���ǣ�" + list.remove(1));//null
		System.out.println(list); //[����, null, abc, abc, 10, true]
		
		//remove(obj) ɾ��ָ����Ԫ��
		System.out.println("ɾ���Ƿ�ɹ���" + list.remove(null));
		System.out.println(list);//[����, abc, abc, 10, true]
		
		//set(index,element) ��ָ��index�±�λ�ã�ʹ��element�����滻
		list.set(0, "add");
		System.out.println(list);//[add, abc, abc, 10, true]
		
		/**
		 * toArray() ���� -> ����
		 */
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		
		/**
		 * �������飺for----------------------------------������ʣ�-----�����鳤�ȡ���array.length-------������ȡֵ����array[i]
		 */
		for (int i = 0; i < array.length; i++) {
			
			Object element = array[i];
			
			System.out.println(element);
		}
		System.out.println("--------------------------------");
		
		/**
		 * �������飺forEach
		 */
		for (Object element : array) {
			System.out.println(element);
		}
		
		System.out.println("--------------------------------");
		
		/**
		 * ֱ�ӱ������ϣ�for----------------------------------���Ϸ��ʣ�-----�����ϳ��ȡ���list.size()------������ȡֵ����list.get(i)
		 */
		for (int i = 0; i < list.size(); i++) {
			
			Object element = list.get(i);
			
			System.out.println(element);
		}
		
		System.out.println("--------------------------------");

		
		/**
		 * ֱ�ӱ������ϣ�forEach
		 */
		for (Object element : list) {
			System.out.println(element);
		}
		
		System.out.println("--------------------------------");

		/**
		 * �������������ϣ�Iterator
		 */
		Iterator iterator = list.iterator();
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  "  + iterator.next());
//		System.out.println(iterator.hasNext() + "  ");//����false��˵������Ԫ�ؿ�ȡ
		while(iterator.hasNext())
		{
			Object element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("--------------------------------");
		
		/**
		 * �������������ϣ�ListIterator
		 */
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext())
		{
			Object element = listIterator.next();
			
			System.out.println(element);
		}
	}
}
