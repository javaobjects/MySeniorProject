package com.neuedu.chapter03.file;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		/**
		 * 1.创建对象
		 */
		//1. 根据绝对路径创建文件对象
		File file = new File("D:\\temp\\file.txt");
		File file2 = new File("D:/temp/file.txt");
		
		//2. 根据相对路径创建文件对象
		File file3 = new File("file/file.txt");//相对于当前项目根路径
		
		//3. 根据指定的父目录，查找指定的文件对象
		File file4 = new File(new File("D:/temp"), "file.txt");
		
		//4. 根据指定的父目录，查找指定的文件对象
		File file5 = new File("D:/temp", "file.txt");
		
		//判断文件是否存在
		System.out.println(file5.exists());
	}
	
}
