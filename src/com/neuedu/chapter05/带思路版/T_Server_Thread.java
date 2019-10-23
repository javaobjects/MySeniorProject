package com.neuedu.chapter05.��˼·��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

//������̣߳�������ͻ���֮�以����Ϣ
public class T_Server_Thread extends Thread {

	private Socket socket;
	
	public T_Server_Thread(Socket socket)
	{
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//�ַ���  һ��һ�ж�ȡ����
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream())); //�ַ���  һ��һ���������
			while(true)
			{
				//5.���տͻ��˷��͵���Ϣ
				String message = reader.readLine();
				System.out.println("�ͻ���˵��" + message);
				
				//�жϿͻ����Ƿ�����
				if("exit".equals(message))
				{
					System.out.println("----------�����棺�ͻ��������ߡ�-----------------");
				}
				
				//Ⱥ���������пͻ���ת���յ�����Ϣ
				HashMap<Integer,Socket> socketMap = T_Server.socketMap;
				Collection<Socket> sockets = socketMap.values();
				for (Socket clientSocket : sockets) {
					PrintWriter clientWriter = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream())); //�ַ���  һ��һ���������
					clientWriter.println(message);
					clientWriter.flush();
				}
				
				//6.���ͻ��˷�����Ϣ
				/*Scanner scanner = new Scanner(System.in);
				System.out.println("����ˣ������룺");
				String sendMessage = scanner.nextLine();
				
				writer.println(sendMessage);
				writer.flush();*/
			}
		} catch (IOException e) {
			e.printStackTrace();
		}   
	}
}
