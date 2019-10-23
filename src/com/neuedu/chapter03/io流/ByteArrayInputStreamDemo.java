package com.neuedu.chapter03.io流;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		byte[] b = new byte[]{1,2,3,4,5,6,7};
		
		ByteArrayInputStream input = new ByteArrayInputStream(b);
		
		//read() 读取一个字节
		int content = input.read();
		System.out.println(content);//1
		
		//available() 剩余可读字节数
		System.out.println(input.available());//6
		
		//mark() 设置标记1,通常与reset()方法结合使用
		input.mark(1);
		
		//skip() 跳跃过N个字节，再继续读取
		input.skip(3);
		
		//read() 读取一个字节
		content = input.read();
		System.out.println(content);//5
		
		//reset() 重置到最近的mark位置,通常与mark()方法结合使用
		input.reset();
		 
		content = input.read();
		System.out.println(content);//2
	}
	
}
