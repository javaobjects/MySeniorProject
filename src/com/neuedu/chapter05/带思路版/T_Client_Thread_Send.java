package com.neuedu.chapter05.��˼·��;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//�ͻ��ˣ�������Ϣ�߳�
public class T_Client_Thread_Send extends Thread {
	
	private Socket socket;
	
	public T_Client_Thread_Send(Socket socket)
	{
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			while(true)
			{
				PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));//�ַ���  һ��һ���������
	
				Scanner scanner = new Scanner(System.in);
				System.out.println("�ͻ��ˣ������룺");
				String sendMessage = scanner.nextLine();
				
				writer.println(sendMessage);
				writer.flush();
				
				//�ж�����ͻ�������"exit"����ͻ���׼���˳�
				if("exit".equals(sendMessage))
				{
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}           
	}
	
}
