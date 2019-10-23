package com.neuedu.chapter05.��˼·��;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ���
public class T_Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			//3.���ӷ�����
			socket = new Socket("127.0.0.1",8888);//localhost 127.0.0.1��ʾ����    Ҳ����д�����IP��ַ
		
			//4.��������������Ϣ
			T_Client_Thread_Send sendThread = new T_Client_Thread_Send(socket);
			sendThread.start();
			
			//7.���շ�������Ϣ
			T_Client_Thread_Receive receiveThread = new T_Client_Thread_Receive(socket);
			receiveThread.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//8.�ر���Դ���ͷ���Դ
			/*try {
				if(socket != null)
				{
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
	}
}
