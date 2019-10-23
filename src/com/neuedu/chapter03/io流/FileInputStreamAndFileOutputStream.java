package com.neuedu.chapter03.io��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamAndFileOutputStream {
	
	/**
	 	FileInputStream:���ֽ�Ϊ��λ��ȡ����
	 	FileOutputStream:���ֽ�Ϊ��λд������
	 	
	 		���ļ�file/file.txt���Ƶ�file/file_bak.txt�ļ���
	 */
	public static void main(String[] args) {
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			//�ֽ�������
			input = new FileInputStream("file/file.txt");
			//�ֽ������
			output = new FileOutputStream("file/file_bak.txt",true);//��������ʾ׷�ӵ��ĵ�ĩβ��Ĭ��Ϊfalse
			
			/*
			 	��ȡ�����ֽڸ����� 3  ��ȡ�����ֽڣ�[49, 50, 51]
				��ȡ�����ֽڸ����� 3  ��ȡ�����ֽڣ�[97, 98, 99]
				��ȡ�����ֽڸ����� 2  ��ȡ�����ֽڣ�[-42, -48, 99]
			 */
			//ѭ����ȡ
			byte[] b = new byte[3];//���ڱ����ȡ���ֽ�����
			int count = -1;        //���ڱ����ȡ�����ֽڸ���
			while((count = input.read(b)) != -1)
			{
				System.out.println("��ȡ�����ֽڸ����� " + count + "  ��ȡ�����ֽڣ�" + Arrays.toString(b));
				
				//д��ָ���ļ�
				output.write(b, 0, count);
			}
			
			//����
			output.write('\n');
			
			//ע��һ.................ǿ��ˢ���ݴ���
			output.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//ע���.....................�ͷ���Դ���ر���Դ
			//ʹ��˳��input -> output
			//�ر�˳��output -> input
			try {
				if(output != null)
				{
					output.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(input != null)
				{
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
