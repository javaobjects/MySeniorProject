package com.neuedu.chapter01.math算数类;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {
		/**
		 * 1.创建对象：Math的所有的属性与方法均为static修饰，不需要new对象
		 */
		
		/**
		 * 2.常用属性
		 */
		//圆周率
		System.out.println(Math.PI);//3.141592653589793
		
		//自然对数底数
		System.out.println(Math.E);//2.718281828459045
		
		/**
		 * 3.常用方法
		 */
		//abs() 取绝对值
		System.out.println(Math.abs(123.456));//123.456
		System.out.println(Math.abs(-123.456));//123.456
		
		//round() 四舍五入取整
		System.out.println(Math.round(123.456));//123
		System.out.println(Math.round(123.556));//124
		System.out.println(Math.round(-123.456));//-123
		System.out.println(Math.round(-123.556));//-124
		
		//ceil() 向上取整:取大于该值最小的整数
		System.out.println(Math.ceil(123.456));//124
		System.out.println(Math.ceil(123.556));//124
		System.out.println(Math.ceil(-123.456));//-123
		System.out.println(Math.ceil(-123.556));//-123
		
		//floor() 向下取整：取小于该值的最大的整数
		System.out.println(Math.floor(123.456));//123
		System.out.println(Math.floor(123.556));//123
		System.out.println(Math.floor(-123.456));//-124
		System.out.println(Math.floor(-123.556));//-124
		
		//max() 取最大值
		System.out.println(Math.max(10, 20));//20
		
		//min() 取最小值
		System.out.println(Math.min(10, 20));//10
		
		//random() 获取随机值，默认0.0~1.0之间
		System.out.println(Math.random());//0.0~1.0之间
		System.out.println(Math.round(Math.random()*10));//0~10之间的整数
		
		//Random类
		Random random = new Random();
		System.out.println(random.nextInt());  //生成int返回内的有效int整数
		System.out.println(random.nextInt(11));//0~10之间的整数
		
		/**
		 * 生成随机验证码:
		 * 
		 * 		数字、大写字母、小写字母：不包括 0、1、O、o、L、l
		 */
		char[] codes = new char[]{'2','3','4','5','6','7','8','9','a','b','c','d','e','f','A','B','C','D','E','F','G','H'};
		
		//验证码
		String code = "";
		
		for (int i = 1; i <= 4; i++) {
			int index = random.nextInt(codes.length);
			code += codes[index];
		}
		
		System.out.println("随机验证码：" + code);
	}
}
