package com.neuedu.chapter03.file.��ϰ;

import java.io.File;

public class _01 {

	/**
	 * 1���ڱ����Ĵ���ϵͳ�У���һ���ļ��У�����File����ṩ�������г����ļ����е������ļ����ļ������ļ���·����ִ��Ч�����£�[������]
			·����xxx���ļ����ڵ��ļ��У�
			 	�ļ�����abc.txt
				·������c:\temp\abc.txt 
				--------------------------------------------
				�ļ�����def.txt
				·������c:\temp\def.txt
	 */
	public static void main(String[] args) {
		
		File file = new File("D:\\temp");
		
		listFiles(file);
		
	}
	/**
	 * ��ȡָ��file�����е��ļ���Ϣ
	 * @param file
	 */
	private static void listFiles(File file) {
		//�鿴D:\\temp·�������е��ļ�
		File[] files = file.listFiles();
		for (File file2 : files) {
			//�ļ�
			if(file2.isFile())
			{
				//if(file2.getName().contains("file"))
				//{
					System.out.println("�ļ�����" + file2.getName());
					System.out.println("·������" + file2.getAbsolutePath());
					
					System.out.println("--------------------------------------------");
				//}
			}
			//�ļ���
			else
			{
				//System.out.println("�ļ�" + file2.getName() + "��һ���ļ���\n");
				
				//�����鿴�ļ����е������ļ�
				listFiles(file2);//�ݹ���ã��ڷ������Լ������Լ�
			}
		}
	}
}