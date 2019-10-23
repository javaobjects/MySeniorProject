package com.neuedu.chapter02;

import java.util.LinkedList;

public class LinkedListDemo {
	/**
		LinkedList:
			1.�������Ԫ�ص�˳�����ڴ��д洢��˳��һ��
			2.�����ظ�
			3.����nullֵ
			4.�洢�ṹ������洢����ѯЧ�ʽϵͣ���������ɾ��Ч�ʽϸ�
			5.����ֻ����洢�������Ͷ��󣬵��ǻ����������Ϳ����Զ�װ��
			6.LinkedList�ķ��� > ArrayList�ķ���
	 */
	public static void main(String[] args) {
		
		/**
		 * 1.��������
		 */
		//����һ������
		LinkedList list = new LinkedList();
		list.add(null);
		list.add(null);
		list.add("abc");
		list.add(new String("abc"));
		list.add(10);   //�Զ�װ��  �������� -> ��װ��Integer
		list.add(true); //�Զ�װ��  �������� -> ��װ��Boolean
		
		System.out.println(list);//[null, null, abc, abc, 10, true]
		
		/**
		 * 2.���еķ����������βԪ�ؽ���������ɾ������ȡ��
		 */
		//addFirst() ��Ԫ����ӵ���һλ
		list.addFirst("�ײ�");
		System.out.println(list);//[�ײ�, null, null, abc, abc, 10, true]

		//addLast() ��Ԫ����ӵ����һλ
		list.addLast("β��");
		System.out.println(list);//[�ײ�, null, null, abc, abc, 10, true, β��]
		
		//getFirst() ��ȡ��һ��Ԫ��
		System.out.println(list.getFirst());//�ײ�
		
		//getLast() ��ȡ���һ��Ԫ��
		System.out.println(list.getLast());//β��
		
		//removeFirst()  ɾ�������ص�һ��Ԫ��
		System.out.println(list.removeFirst());//�ײ�
		System.out.println(list);//[null, null, abc, abc, 10, true, β��]
		
		//removeLast()  ɾ�����������һ��Ԫ��
		System.out.println(list.removeLast());//β��
		System.out.println(list); //[null, null, abc, abc, 10, true]
		
	}
}
