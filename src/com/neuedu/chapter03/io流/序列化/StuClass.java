package com.neuedu.chapter03.io��.���л�;

import java.io.Serializable;

//ѧ���༶
public class StuClass implements Serializable,Cloneable{

	//�༶��� 125
	private int cid;
	
	//�༶���� "java8��"
	private String cname;

	//���� ����
	public StuClass() {
		super();
	}
	public StuClass(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	//������
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	//��д�����toString
	@Override
	public String toString() {
		return "StuClass [cid=" + cid + ", cname=" + cname + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
