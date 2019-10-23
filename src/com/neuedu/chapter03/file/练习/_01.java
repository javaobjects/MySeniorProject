package com.neuedu.chapter03.file.练习;

import java.io.File;

public class _01 {

	/**
	 * 1、在本机的磁盘系统中，找一个文件夹，利用File类的提供方法，列出该文件夹中的所有文件的文件名和文件的路径，执行效果如下：[必做题]
			路径是xxx的文件夹内的文件有：
			 	文件名：abc.txt
				路径名：c:\temp\abc.txt 
				--------------------------------------------
				文件名：def.txt
				路径名：c:\temp\def.txt
	 */
	public static void main(String[] args) {
		
		File file = new File("D:\\temp");
		
		listFiles(file);
		
	}
	/**
	 * 获取指定file下所有的文件信息
	 * @param file
	 */
	private static void listFiles(File file) {
		//查看D:\\temp路径下所有的文件
		File[] files = file.listFiles();
		for (File file2 : files) {
			//文件
			if(file2.isFile())
			{
				//if(file2.getName().contains("file"))
				//{
					System.out.println("文件名：" + file2.getName());
					System.out.println("路径名：" + file2.getAbsolutePath());
					
					System.out.println("--------------------------------------------");
				//}
			}
			//文件夹
			else
			{
				//System.out.println("文件" + file2.getName() + "是一个文件夹\n");
				
				//继续查看文件夹中的所有文件
				listFiles(file2);//递归调用，在方法中自己调用自己
			}
		}
	}
}