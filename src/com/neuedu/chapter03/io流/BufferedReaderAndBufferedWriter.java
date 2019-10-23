package com.neuedu.chapter03.io流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndBufferedWriter {
	
	/**
	 	FileReader:以字符为单位读取数据---节点流，能够直接访问外部文件
	 	FileWriter:以字符为单位写出数据---节点流，能够直接访问外部文件
	 	
	 	BufferedReader:以字符为单位读取数据---处理流，不能够直接访问外部文件
	 		readLine() 可以一行一行读取数据，特有的方法
	 	
	 	BufferedWriter:以字符为单位写出数据---处理流，不能够直接访问外部文件
	 		newLine() 可以换行输出数据，特有的方法
	 */
	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try{
			//字符输入流（节点流）
			FileReader in = new FileReader("file/file.txt");
			//字符输入流（处理流）
			reader = new BufferedReader(in);
			
			//字符输出流（节点流）
			FileWriter out = new FileWriter("file/file_bak.txt");
			//字符输出流（处理流）
			writer = new BufferedWriter(out);
			
			String line = null;//一行一行读取数据
			while((line = reader.readLine()) != null)
			{
				System.out.println("读取到的一行数据：" + line);
				
				//写入文件
				writer.write(line);
				writer.newLine(); //输入换行符
			}
			
			//强制刷新
			writer.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
