package com.neuedu.chapter01.String��.��ϰ;

/**
 * 3�����ַ�������дһ������ʵ�ִ������в�������һ�ַ�����ͳ�Ƹ��ַ������ַ���e�����ֵĴ�������ʶ�㣺String�г��õķ����� [������]
 */
public class _03 {

	public static void main(String[] args) {
		String str = "1231elsdjfsdesdlfjslee";
		
		//1.replace�����滻
		int before = str.length();
		str = str.replace("e", "");
		int after = str.length();
		
		System.out.println("e���ֵĴ�����" + (before - after));
		
		//2.����
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
		System.out.println("e���ֵĴ�����" + count);*/
		
		/*int count = 0;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == 'e')
			{
				count++;
			}
		}
		System.out.println("e���ֵĴ�����" + count);*/
		

		//3.����ѭ��
		/*int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'e')
			{
				count++;
			}
		}
		System.out.println("e���ֵĴ�����" + count);*/
		
		//4.split�ָ��ַ���
	   /*String[] array = ("," + str + ",").split("e");
		
		System.out.println(Arrays.toString(array));
		System.out.println("e���ֵĴ�����" + (array.length - 1));*/
		
		
		//5.substring��ȡ�ַ���
		int count = 0;
		while(str.indexOf("e") != -1)
		{
			count++;
			str = str.substring(str.indexOf("e")+1);
		}
		System.out.println("e���ֵĴ�����" + count);
		
	}
	
}
