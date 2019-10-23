package com.neuedu.chapter01.object类;

public class ObjectDemo {

	public static void main(String[] args) {
		/**
		 * 1.创建对象（构造函数）
		 */
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		/**
		 * 2.常用方法
		 */
		//equals() 判断某个对象是否与此对象"相等"
		System.out.println(obj1 == obj2);     //false  比较地址值
		System.out.println(obj1.equals(obj2));//false  比较地址值
		
		//hashCode() 返回该对象的十进制哈希码值，即对象引用地址，即每个对象的身份证ID
		System.out.println(obj1.hashCode());//931262393
		System.out.println(obj2.hashCode());//866219815
		
		//toString() 将对象转换为字符串返回: 包名  +  类名 + '@' + 十六进制的hashCode
		System.out.println(obj1.toString());//java.lang.Object@3781efb9
		System.out.println(obj2.toString());//java.lang.Object@33a17727
		
		/**
		 *  == 与 equals的比较：
		 *      
		 *      ==：既可以比较基本数据类型，也可以比较引用类型
		 *      	当==比较基本数据类型时，比较字面值，例如 3 == 13；
		 *          当==比较引用类型，比较引用地址，例如obj1 == obj2；
		 *          
		 *      equals（）：只能比较引用类型，且默认情况下比较引用地址
		 *  	              但是具体是否相等，需看子类是否重写父类的equals（）方法
		 */
	}
	
}
