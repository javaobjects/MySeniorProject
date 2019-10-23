package com.neuedu.chapter03.io��;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		byte[] b = new byte[]{1,2,3,4,5,6,7};
		
		ByteArrayInputStream input = new ByteArrayInputStream(b);
		
		//read() ��ȡһ���ֽ�
		int content = input.read();
		System.out.println(content);//1
		
		//available() ʣ��ɶ��ֽ���
		System.out.println(input.available());//6
		
		//mark() ���ñ��1,ͨ����reset()�������ʹ��
		input.mark(1);
		
		//skip() ��Ծ��N���ֽڣ��ټ�����ȡ
		input.skip(3);
		
		//read() ��ȡһ���ֽ�
		content = input.read();
		System.out.println(content);//5
		
		//reset() ���õ������markλ��,ͨ����mark()�������ʹ��
		input.reset();
		 
		content = input.read();
		System.out.println(content);//2
	}
	
}
