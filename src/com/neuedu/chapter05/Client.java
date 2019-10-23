package com.neuedu.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ���
public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			//3.���ӷ�����
			socket = new Socket("127.0.0.1",8888);//localhost 127.0.0.1��ʾ����    Ҳ����д�����IP��ַ
		
			//4.��������������Ϣ
			OutputStream out = socket.getOutputStream();               //�ֽ���    һ���ֽ�һ���ֽ��������
			OutputStreamWriter outWriter = new OutputStreamWriter(out);//�ַ���     һ���ַ�һ���ַ��������
			PrintWriter writer = new PrintWriter(outWriter);           //�ַ���  һ��һ���������
			
			writer.println("��ã�����");
			writer.flush();
			
			//7.���շ�������Ϣ
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //�ַ���  һ��һ�ж�ȡ����
			String message = reader.readLine();
			System.out.println("�����˵��" + message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//8.�ر���Դ���ͷ���Դ
			try {
				if(socket != null)
				{
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
