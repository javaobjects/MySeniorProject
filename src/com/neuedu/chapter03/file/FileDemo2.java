package com.neuedu.chapter03.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("file/2019-09-09.log");
		
		//exists() �ж��ļ��Ƿ����
		if(!file.exists())
		{
			//createNewFile() �����ļ�
			boolean result = file.createNewFile();
			System.out.println("���ļ����������" + result);
		}
		
		//���÷���
		System.out.println("����·����" + file.getAbsolutePath());//D:\FY19JAVA8���Ͽ�����\03.Java�߼�Ӧ�ñ��\03.�Ͽδ���\MySeniorProject\file\2019-09-09.log
		System.out.println("���·����" + file.getPath());  //file\2019-09-09.log
		System.out.println("�ļ��Ƿ�ɶ���" + file.canRead());  //true
		System.out.println("�ļ��Ƿ��д��" + file.canWrite());  //true
		System.out.println("�ļ������ݳ��ȣ�" + file.length());   //8
		System.out.println("�Ƿ�Ϊһ���ļ�����" + file.isFile());//true
		System.out.println("�Ƿ�Ϊһ���ļ��ж���" + file.isDirectory());//false
		System.out.println("�ļ����ƣ�" + file.getName());//2019-09-09.log
		System.out.println("�ļ�����޸�ʱ�䣺" + new Date(file.lastModified()).toLocaleString());//2019-9-9 9:58:24
	
		//renameTo() �������ļ�����
		//System.out.println("�����������" + file.renameTo(new File("file/2019-09-09.log.bak")));
		
		/*
		  		������ʱ�ļ���
		  		
		  		  %AppData%\Local\Temp\io����ʱ�ļ�����671563688924681378.pptx
		  			
		  		  win+R -> %AppData% -> �س���ѯ��ʱ�ļ���·��
		  				
		 */
		File tempFile = File.createTempFile("io����ʱ�ļ�����", ".pptx");
		System.out.println(tempFile.getAbsolutePath());
		
		File tempFile2 = File.createTempFile("��ʷ��Ϣ��¼", ".log", new File("file"));
		System.out.println(tempFile2.getAbsolutePath());
		
		//ɾ���ļ�
		tempFile.delete();       //����ɾ��
		tempFile2.deleteOnExit();//�˳�ϵͳʱɾ��
		
		//list() ��ȡָ���ļ��������е�һ��Ŀ¼�ġ��ļ�·����
		File file2 = new File("D:\\temp");
		String[] listFiles = file2.list();
		for (String str : listFiles) {
			System.out.println(str);
		}
		
		//listFiles()  ��ȡָ���ļ��������е�һ��Ŀ¼�ġ��ļ�����
		File[] files = file2.listFiles();
		for (File file3 : files) {
			System.out.println(file3.getName() + " " + file3.length());
		}
		
		//mkdir() ��ഴ��һ���ļ���
		File file4 = new File("file/file_01");
		System.out.println("�ļ����Ƿ񴴽��ɹ���" + file4.mkdir());
		
		//mkdirs() ����·�������в����ڵ��ļ���
		File file5 = new File("file/file_02/2019��9��9��/02");
		System.out.println("���������ļ����Ƿ�ɹ���" + file5.mkdirs());
	}
	
}
