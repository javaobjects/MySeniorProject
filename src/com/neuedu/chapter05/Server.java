package com.neuedu.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//������
public class Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			//1.����������
			ss = new ServerSocket(8888);
			System.out.println("������������....");
			
			//2.�ȴ��ͻ�������
			socket = ss.accept();//����ʽ��ʽ��ֱ���ͻ������ӽ���������������ܼ���ִ��
			System.out.println("���µĿͻ������ӽ���........" + socket.getInetAddress() + ":" + socket.getPort());
			
			//5.���տͻ��˷��͵���Ϣ
			InputStream in = socket.getInputStream();				//�ֽ���   һ���ֽ�һ���ֽڶ�ȡ����
			InputStreamReader inReader = new InputStreamReader(in); //�ַ���  һ���ַ�һ���ַ���ȡ����
			BufferedReader reader = new BufferedReader(inReader);   //�ַ���  һ��һ�ж�ȡ����
			
			String message = reader.readLine();
			System.out.println("�ͻ���˵��" + message);
			
			//6.���ͻ��˷�����Ϣ
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream())); //�ַ���  һ��һ���������
			writer.println("��ã��Ҳ��ڣ������ԣ�����");
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//8.�ر���Դ���ͷ���Դ
			try {
				if(socket != null)
				{
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(ss != null)
				{
					ss.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
