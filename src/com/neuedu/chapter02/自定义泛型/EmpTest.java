package com.neuedu.chapter02.自定义泛型;

public class EmpTest {

	public static void main(String[] args) {
		//未使用泛型
		/*Emp zhangsan = new Emp();
		zhangsan.setEname("张三");
		zhangsan.setEname(007);
		zhangsan.setEname(true);*/
		
		//使用泛型
		/*Emp<String> lisi = new Emp<String> ();
		lisi.setEname("李四");
		//lisi.setEname(10);*/
		
		Emp<Integer> wangwu = new Emp<Integer>();
		wangwu.setEname(007);
	}
}
