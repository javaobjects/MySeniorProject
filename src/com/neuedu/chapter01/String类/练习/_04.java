package com.neuedu.chapter01.String类.练习;

/**
 * 4.【字符串】输入一个手机号码，将中间四位使用星号替代。【必做题】
	   	例如：
			  输入：13312349876
			  输出：133****9876

 */
public class _04 {

	public static void main(String[] args) {
		String telephone = "13312346789";
		
		//1.截取、拼接
		/*//前三位
		String before = telephone.substring(0, 3);
		//中间四位
		//****
		//后四位
		String after = telephone.substring(7);
		
		System.out.println(before + "****" + after);*/
		
		
		//2.替换
		/*char[] chars = telephone.toCharArray();
		
		//将下标为3-6的字符替换为*
		for (int i = 3; i <= 6; i++) {
			chars[i] = '*';
		}
		String newStr = new String(chars);
		
		System.out.println(newStr);*/
		
		
		//3.正则表达式
		telephone = telephone.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
		System.out.println(telephone);
	}
	
}
