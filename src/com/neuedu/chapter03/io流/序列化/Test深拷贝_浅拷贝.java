package com.neuedu.chapter03.io流.序列化;

public class Test深拷贝_浅拷贝 {

	/**
	  		浅拷贝：克隆对象时，不会克隆引用对象的属性，例如，不会克隆Student的StudentClass
	  		
	  		深拷贝：克隆对象时，会克隆引用对象的属性，例如，会克隆Student的StudentClass
	  		
	  			1. 对象序列化默认做深拷贝
	  			
	  			2. 其他对象需要被拷贝
	  				① 实现允许克隆的接口
	  					public class Student implements Cloneable{}
	  					
	  				② 重写clone方法
	  					protected Object clone() throws CloneNotSupportedException {
							Student stuClone = (Student)super.clone();
							
							StuClass stuClassClone = (StuClass)stuClone.getStuClass().clone();
							stuClone.setStuClass(stuClassClone);
							
							return stuClone;
						}
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		/**
		 * 原对象
		 */
		StuClass stuClass = new StuClass(125, "Java8班");
		Student jinquan = new Student(10000, "锦权", 18, "男", "东软大厦125C",stuClass);
		
		/**
		 * 克隆对象
		 */
		Student jinquanClone = (Student)jinquan.clone();
		
		//输出两个对象Student的地址
		System.out.println(jinquan.hashCode());     //2059712038
		System.out.println(jinquanClone.hashCode());//143833026
		
		jinquanClone.setSex("女");
		
		System.out.println("原来的锦权：" + jinquan.getSex());     //男
		System.out.println("后来的锦权：" + jinquanClone.getSex());//女
		
		//输出两个对象StudentClass的地址
		System.out.println(jinquan.getStuClass().hashCode());     //143833026
		System.out.println(jinquanClone.getStuClass().hashCode());//143833026
		
		jinquanClone.getStuClass().setCname("Java8大神班");
		
		System.out.println("原来的锦权：" + jinquan.getStuClass().getCname());     //Java8大神班
		System.out.println("后来的锦权：" + jinquanClone.getStuClass().getCname());//Java8大神班
	}
}
