package com.neuedu.chapter03.io��;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			/**
			 * 1.��������
			 */
			FileInputStream input = new FileInputStream("file/file.txt");
			
			/**
			 * 2.���÷���
			 */
			/**
			 * read()  һ���ֽ�һ���ֽڶ�ȡ���ݣ�������-1��˵���ĵ���ȡ����
			 */
			/*int content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//49
			
			content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//50
			
			content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//51
			
			content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//97
			
			content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//98
			
			content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//99
			
			content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//214
			
			content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//208
			
			content = input.read();
			System.out.println("��ȡ���ֽڣ�" + content);//-1*/	
			
			/*int content = -1;
			while((content = input.read()) != -1)//�Ƚ�input.read()��ȡ�����ֽڸ�ֵ��content������Ȼ�����ж�content�Ƿ����-1
			{
				System.out.println("��ȡ�����ֽڣ�" + content);
			}*/
			
			/**
			 * read(byte[] b) һ���ֽ�����һ���ֽ������ȡ������-1����ʾ�ĵ��Ѿ���ȡ����
			 */
			/*byte[] b = new byte[3];//һ������Ϊ1024�ı���
			int content = input.read(b);
			System.out.println(content  + "  "  + Arrays.toString(b));//3  [49, 50, 51]
			
			content = input.read(b);
			System.out.println(content  + "  "  + Arrays.toString(b));//3  [97, 98, 99]
			
			content = input.read(b);
			System.out.println(content  + "  "  + Arrays.toString(b));//2  [-42, -48, 99]
			
			content = input.read(b);
			System.out.println(content  + "  "  + Arrays.toString(b));//-1  [-42, -48, 99]*/	
			
			/*
			 *  ��ȡ���ֽڸ�����3  ��ȡ�����ݣ� [49, 50, 51]
				��ȡ���ֽڸ�����3  ��ȡ�����ݣ� [97, 98, 99]
				��ȡ���ֽڸ�����2  ��ȡ�����ݣ� [-42, -48, 99]
			 */
			byte[] b = new byte[3];//�û�����ÿ�ζ�ȡ�����ֽ����ݣ�һ������Ϊ1024�ı���
			int count = -1;        //���ڱ���ÿ�ζ�ȡ�����ֽڸ���
			while((count = input.read(b)) != -1)
			{
				System.out.println("��ȡ���ֽڸ�����" + count + "  ��ȡ�����ݣ� " + Arrays.toString(b));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
