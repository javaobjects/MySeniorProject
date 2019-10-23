package com.neuedu.chapter03.io��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndBufferedWriter {
	
	/**
	 	FileReader:���ַ�Ϊ��λ��ȡ����---�ڵ������ܹ�ֱ�ӷ����ⲿ�ļ�
	 	FileWriter:���ַ�Ϊ��λд������---�ڵ������ܹ�ֱ�ӷ����ⲿ�ļ�
	 	
	 	BufferedReader:���ַ�Ϊ��λ��ȡ����---�����������ܹ�ֱ�ӷ����ⲿ�ļ�
	 		readLine() ����һ��һ�ж�ȡ���ݣ����еķ���
	 	
	 	BufferedWriter:���ַ�Ϊ��λд������---�����������ܹ�ֱ�ӷ����ⲿ�ļ�
	 		newLine() ���Ի���������ݣ����еķ���
	 */
	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try{
			//�ַ����������ڵ�����
			FileReader in = new FileReader("file/file.txt");
			//�ַ�����������������
			reader = new BufferedReader(in);
			
			//�ַ���������ڵ�����
			FileWriter out = new FileWriter("file/file_bak.txt");
			//�ַ����������������
			writer = new BufferedWriter(out);
			
			String line = null;//һ��һ�ж�ȡ����
			while((line = reader.readLine()) != null)
			{
				System.out.println("��ȡ����һ�����ݣ�" + line);
				
				//д���ļ�
				writer.write(line);
				writer.newLine(); //���뻻�з�
			}
			
			//ǿ��ˢ��
			writer.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
