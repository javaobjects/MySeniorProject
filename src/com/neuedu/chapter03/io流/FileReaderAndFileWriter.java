package com.neuedu.chapter03.io��;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderAndFileWriter {
	/**
	 	FileReader:���ַ�Ϊ��λ��ȡ����
	 	FileWriter:���ַ�Ϊ��λд������
	 	
	 		���ļ�file/file.txt���Ƶ�file/file_bak.txt�ļ���
	 */
	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		try {
			//�ַ�������
			reader = new FileReader("file/file.txt");
			//�ַ������ 
			writer = new FileWriter("file/file_bak.txt");
			
			/*
			 	��ȡ�����ַ�������3  ��ȡ�����ַ� :[1, 2, 3]
				��ȡ�����ַ�������3  ��ȡ�����ַ� :[a, b, c]
				��ȡ�����ַ�������1  ��ȡ�����ַ� :[��, b, c]
			 */
			char[] c = new char[3];//���ڱ���ÿ�ζ�ȡ���ַ����ݣ�һ������Ϊ1024�ı���
			int count = -1;	       //���ڱ����ȡ�����ַ�����
			while((count = reader.read(c)) != -1)
			{
				System.out.println("��ȡ�����ַ�������" + count  + "  ��ȡ�����ַ� :" + Arrays.toString(c) );
				
				//�����е���ĸ��Ϊ��д
				String str = new String(c, 0, count);
				str = str.toUpperCase();
				
				//д���ļ�
				//writer.write(c,0,count);
				writer.write(str);
			}
			
			//ע��һ.....................ǿ��ˢ���ݴ���
			writer.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//ע���.....................�ͷ���Դ���ر���Դ
			//ʹ��˳��reader -> writer
			//�ر�˳��writer -> reader
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
