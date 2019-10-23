package com.neuedu.chapter02.自定义泛型;

/**
 * E 表示任意类型
 * E extends Number : 表示Number的任意子类类型
 */
public class Emp<E extends Number> {

	//修饰属性（成员变量）
	private E ename;
	
	//修饰构造函数
	public Emp()
	{
		
	}
	public Emp(E ename)
	{
		this.ename = ename;
	}
	
	//修饰普通方法
	public void setEname(E ename)
	{
		this.ename = ename;
	}
}
