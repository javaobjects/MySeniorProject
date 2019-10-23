package com.neuedu.chapter03.io流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			/**
			 * 1.创建对象
			 */
			FileInputStream input = new FileInputStream("file/file.txt");
			
			/**
			 * 2.常用方法
			 */
			/**
			 * read()  一个字节一个字节读取数据，当返回-1，说明文档读取结束
			 */
			/*int content = input.read();
			System.out.println("读取的字节：" + content);//49
			
			content = input.read();
			System.out.println("读取的字节：" + content);//50
			
			content = input.read();
			System.out.println("读取的字节：" + content);//51
			
			content = input.read();
			System.out.println("读取的字节：" + content);//97
			
			content = input.read();
			System.out.println("读取的字节：" + content);//98
			
			content = input.read();
			System.out.println("读取的字节：" + content);//99
			
			content = input.read();
			System.out.println("读取的字节：" + content);//214
			
			content = input.read();
			System.out.println("读取的字节：" + content);//208
			
			content = input.read();
			System.out.println("读取的字节：" + content);//-1*/	
			
			/*int content = -1;
			while((content = input.read()) != -1)//先将input.read()读取到的字节赋值给content变量，然后再判断content是否等于-1
			{
				System.out.println("读取到的字节：" + content);
			}*/
			
			/**
			 * read(byte[] b) 一个字节数组一个字节数组读取，返回-1，表示文档已经读取结束
			 */
			/*byte[] b = new byte[3];//一般设置为1024的倍数
			int content = input.read(b);
			System.out.println(content  + "  "  + Arrays.toString(b));//3  [49, 50, 51]
			
			content = input.read(b);
			System.out.println(content  + "  "  + Arrays.toString(b));//3  [97, 98, 99]
			
			content = input.read(b);
			System.out.println(content  + "  "  + Arrays.toString(b));//2  [-42, -48, 99]
			
			content = input.read(b);
			System.out.println(content  + "  "  + Arrays.toString(b));//-1  [-42, -48, 99]*/	
			
			/*
			 *  读取的字节个数：3  读取的内容： [49, 50, 51]
				读取的字节个数：3  读取的内容： [97, 98, 99]
				读取的字节个数：2  读取的内容： [-42, -48, 99]
			 */
			byte[] b = new byte[3];//用户保存每次读取到的字节数据，一般设置为1024的倍数
			int count = -1;        //用于保存每次读取到的字节个数
			while((count = input.read(b)) != -1)
			{
				System.out.println("读取的字节个数：" + count + "  读取的内容： " + Arrays.toString(b));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
