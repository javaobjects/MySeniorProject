package com.neuedu.chapter05.��˼·��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//�ͻ��ˣ�������Ϣ�߳�
public class T_Client_Thread_Receive extends Thread {

	private Socket socket;
	
	public T_Client_Thread_Receive(Socket socket)
	{
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			while(true)
			{
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//�ַ���  һ��һ�ж�ȡ����
				String message = reader.readLine();
				
				System.out.println("�����˵��" + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
