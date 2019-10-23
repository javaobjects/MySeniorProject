package com.neuedu.chapter01.String类.练习;

/**
 * 3、【字符串】编写一个程序，实现从命令行参数输入一字符串，统计该字符串中字符“e”出现的次数。（识点：String中常用的方法） [必做题]
 */
public class _03 {

	public static void main(String[] args) {
		String str = "1231elsdjfsdesdlfjslee";
		
		//1.replace（）替换
		int before = str.length();
		str = str.replace("e", "");
		int after = str.length();
		
		System.out.println("e出现的次数：" + (before - after));
		
		//2.数组
		/*String s = "1231elsdjfsdesdlfjslee";
		int count = 0;
		String[] s2 = new String[s.length()];
		for (int i = 0; i < s2.length; i++) {
			s2[i] = s.substring(i, i + 1);
		}
		for (int j = 0; j < s2.length; j++) {
			if (s2[j].indexOf('e') != -1) {
				count++;
			}
		}
		System.out.println("e出现的次数：" + count);*/
		
		/*int count = 0;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == 'e')
			{
				count++;
			}
		}
		System.out.println("e出现的次数：" + count);*/
		

		//3.遍历循环
		/*int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'e')
			{
				count++;
			}
		}
		System.out.println("e出现的次数：" + count);*/
		
		//4.split分割字符串
	   /*String[] array = ("," + str + ",").split("e");
		
		System.out.println(Arrays.toString(array));
		System.out.println("e出现的次数：" + (array.length - 1));*/
		
		
		//5.substring截取字符串
		int count = 0;
		while(str.indexOf("e") != -1)
		{
			count++;
			str = str.substring(str.indexOf("e")+1);
		}
		System.out.println("e出现的次数：" + count);
		
	}
	
}
