package com.neuedu.chapter02.�Զ��巺��;

/**
 * E ��ʾ��������
 * E extends Number : ��ʾNumber��������������
 */
public class Emp<E extends Number> {

	//�������ԣ���Ա������
	private E ename;
	
	//���ι��캯��
	public Emp()
	{
		
	}
	public Emp(E ename)
	{
		this.ename = ename;
	}
	
	//������ͨ����
	public void setEname(E ename)
	{
		this.ename = ename;
	}
}
