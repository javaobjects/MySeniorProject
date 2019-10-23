package com.neuedu.chapter03.io流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamAndFileOutputStream {
	
	/**
	 	FileInputStream:以字节为单位读取数据
	 	FileOutputStream:以字节为单位写出数据
	 	
	 		将文件file/file.txt复制到file/file_bak.txt文件中
	 */
	public static void main(String[] args) {
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			//字节输入流
			input = new FileInputStream("file/file.txt");
			//字节输出流
			output = new FileOutputStream("file/file_bak.txt",true);//参数二表示追加到文档末尾，默认为false
			
			/*
			 	读取到的字节个数： 3  读取到的字节：[49, 50, 51]
				读取到的字节个数： 3  读取到的字节：[97, 98, 99]
				读取到的字节个数： 2  读取到的字节：[-42, -48, 99]
			 */
			//循环读取
			byte[] b = new byte[3];//用于保存读取的字节数据
			int count = -1;        //用于保存读取到的字节个数
			while((count = input.read(b)) != -1)
			{
				System.out.println("读取到的字节个数： " + count + "  读取到的字节：" + Arrays.toString(b));
				
				//写入指定文件
				output.write(b, 0, count);
			}
			
			//换行
			output.write('\n');
			
			//注意一.................强制刷新暂存区
			output.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//注意二.....................释放资源、关闭资源
			//使用顺序：input -> output
			//关闭顺序：output -> input
			try {
				if(output != null)
				{
					output.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(input != null)
				{
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
