package com.neuedu.chapter01.String��.��ϰ;

/**
 * 4.���ַ���������һ���ֻ����룬���м���λʹ���Ǻ�������������⡿
	   	���磺
			  ���룺13312349876
			  �����133****9876

 */
public class _04 {

	public static void main(String[] args) {
		String telephone = "13312346789";
		
		//1.��ȡ��ƴ��
		/*//ǰ��λ
		String before = telephone.substring(0, 3);
		//�м���λ
		//****
		//����λ
		String after = telephone.substring(7);
		
		System.out.println(before + "****" + after);*/
		
		
		//2.�滻
		/*char[] chars = telephone.toCharArray();
		
		//���±�Ϊ3-6���ַ��滻Ϊ*
		for (int i = 3; i <= 6; i++) {
			chars[i] = '*';
		}
		String newStr = new String(chars);
		
		System.out.println(newStr);*/
		
		
		//3.������ʽ
		telephone = telephone.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
		System.out.println(telephone);
	}
	
}
