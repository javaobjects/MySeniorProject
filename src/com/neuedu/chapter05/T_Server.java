package com.neuedu.chapter05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//������
public class T_Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			//1.����������
			ss = new ServerSocket(8888);
			System.out.println("������������....");
			
			while(true)
			{
				//2.�ȴ��ͻ�������
				socket = ss.accept();//����ʽ��ʽ��ֱ���ͻ������ӽ���������������ܼ���ִ��
				System.out.println("���µĿͻ������ӽ���........" + socket.getInetAddress() + ":" + socket.getPort());
				
				//����һ���߳�ר�Ÿ�����ͻ�������
				T_Server_Thread t1 =new T_Server_Thread(socket);
				t1.start();
			}
			
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
