package com.neuedu.chapter03.file;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		/**
		 * 1.��������
		 */
		//1. ���ݾ���·�������ļ�����
		File file = new File("D:\\temp\\file.txt");
		File file2 = new File("D:/temp/file.txt");
		
		//2. �������·�������ļ�����
		File file3 = new File("file/file.txt");//����ڵ�ǰ��Ŀ��·��
		
		//3. ����ָ���ĸ�Ŀ¼������ָ�����ļ�����
		File file4 = new File(new File("D:/temp"), "file.txt");
		
		//4. ����ָ���ĸ�Ŀ¼������ָ�����ļ�����
		File file5 = new File("D:/temp", "file.txt");
		
		//�ж��ļ��Ƿ����
		System.out.println(file5.exists());
	}
	
}
