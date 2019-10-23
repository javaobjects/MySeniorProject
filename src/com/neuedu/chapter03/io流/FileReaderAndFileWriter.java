package com.neuedu.chapter03.io流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderAndFileWriter {
	/**
	 	FileReader:以字符为单位读取数据
	 	FileWriter:以字符为单位写出数据
	 	
	 		将文件file/file.txt复制到file/file_bak.txt文件中
	 */
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		try {
			//字符输入流
			reader = new FileReader("file/file.txt");
			//字符输出流 
			writer = new FileWriter("file/file_bak.txt");
			
			/*
			 	读取到的字符个数：3  读取到的字符 :[1, 2, 3]
				读取到的字符个数：3  读取到的字符 :[a, b, c]
				读取到的字符个数：1  读取到的字符 :[中, b, c]
			 */
			char[] c = new char[3];//用于保存每次读取的字符数据，一般设置为1024的倍数
			int count = -1;	       //用于保存读取到的字符个数
			while((count = reader.read(c)) != -1)
			{
				System.out.println("读取到的字符个数：" + count  + "  读取到的字符 :" + Arrays.toString(c) );
				
				//将所有的字母改为大写
				String str = new String(c, 0, count);
				str = str.toUpperCase();
				
				//写入文件
				//writer.write(c,0,count);
				writer.write(str);
			}
			
			//注意一.....................强制刷新暂存区
			writer.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//注意二.....................释放资源、关闭资源
			//使用顺序：reader -> writer
			//关闭顺序：writer -> reader
			try {
				if(writer != null)
				{
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(reader != null)
				{
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
