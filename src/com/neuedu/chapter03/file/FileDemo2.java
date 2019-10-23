package com.neuedu.chapter03.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("file/2019-09-09.log");
		
		//exists() 判断文件是否存在
		if(!file.exists())
		{
			//createNewFile() 创建文件
			boolean result = file.createNewFile();
			System.out.println("新文件创建结果：" + result);
		}
		
		//常用方法
		System.out.println("绝对路径：" + file.getAbsolutePath());//D:\FY19JAVA8班上课资料\03.Java高级应用编程\03.上课代码\MySeniorProject\file\2019-09-09.log
		System.out.println("相对路径：" + file.getPath());  //file\2019-09-09.log
		System.out.println("文件是否可读：" + file.canRead());  //true
		System.out.println("文件是否可写：" + file.canWrite());  //true
		System.out.println("文件的内容长度：" + file.length());   //8
		System.out.println("是否为一个文件对象：" + file.isFile());//true
		System.out.println("是否为一个文件夹对象：" + file.isDirectory());//false
		System.out.println("文件名称：" + file.getName());//2019-09-09.log
		System.out.println("文件最后修改时间：" + new Date(file.lastModified()).toLocaleString());//2019-9-9 9:58:24
	
		//renameTo() 重名命文件名称
		//System.out.println("重命名结果：" + file.renameTo(new File("file/2019-09-09.log.bak")));
		
		/*
		  		创建临时文件：
		  		
		  		  %AppData%\Local\Temp\io流临时文件测试671563688924681378.pptx
		  			
		  		  win+R -> %AppData% -> 回车查询临时文件夹路径
		  				
		 */
		File tempFile = File.createTempFile("io流临时文件测试", ".pptx");
		System.out.println(tempFile.getAbsolutePath());
		
		File tempFile2 = File.createTempFile("历史消息记录", ".log", new File("file"));
		System.out.println(tempFile2.getAbsolutePath());
		
		//删除文件
		tempFile.delete();       //立即删除
		tempFile2.deleteOnExit();//退出系统时删除
		
		//list() 获取指定文件夹下所有的一级目录的【文件路径】
		File file2 = new File("D:\\temp");
		String[] listFiles = file2.list();
		for (String str : listFiles) {
			System.out.println(str);
		}
		
		//listFiles()  获取指定文件夹下所有的一级目录的【文件对象】
		File[] files = file2.listFiles();
		for (File file3 : files) {
			System.out.println(file3.getName() + " " + file3.length());
		}
		
		//mkdir() 最多创建一个文件夹
		File file4 = new File("file/file_01");
		System.out.println("文件夹是否创建成功：" + file4.mkdir());
		
		//mkdirs() 创建路径中所有不存在的文件夹
		File file5 = new File("file/file_02/2019年9月9日/02");
		System.out.println("批量创建文件夹是否成功：" + file5.mkdirs());
	}
	
}
