package com.neuedu.chapter04.��������;

//�ֿ�
public class Store {

	//�������
	final int MAX_COUNT = 5;
	
	//��ǰ����
	int count;
	
	//���
	public void in()
	{
		System.out.println("���ǰ��棺" + count);
		count++;
		System.out.println("�����棺" + count);
	}
	
	//����
	public void out()
	{
		System.out.println("����ǰ��棺" + count);
		count--;
		System.out.println("������棺" + count);
	}
}
