package com.neuedu.chapter03.io流.序列化;

import java.io.Serializable;

//学生班级
public class StuClass implements Serializable,Cloneable{

	//班级编号 125
	private int cid;
	
	//班级名称 "java8班"
	private String cname;

	//构造 函数
	public StuClass() {
		super();
	}
	public StuClass(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	//访问器
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

	//重写父类的toString
	@Override
	public String toString() {
		return "StuClass [cid=" + cid + ", cname=" + cname + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
