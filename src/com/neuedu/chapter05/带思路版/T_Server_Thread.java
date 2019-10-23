package com.neuedu.chapter05.带思路版;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

//服务端线程：负责与客户端之间互发消息
public class T_Server_Thread extends Thread {

	private Socket socket;
	
	public T_Server_Thread(Socket socket)
	{
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//字符流  一行一行读取数据
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream())); //字符流  一行一行输出数据
			while(true)
			{
				//5.接收客户端发送的消息
				String message = reader.readLine();
				System.out.println("客户端说：" + message);
				
				//判断客户端是否下线
				if("exit".equals(message))
				{
					System.out.println("----------【公告：客户端已下线】-----------------");
				}
				
				//群发：给所有客户端转发收到的消息
				HashMap<Integer,Socket> socketMap = T_Server.socketMap;
				Collection<Socket> sockets = socketMap.values();
				for (Socket clientSocket : sockets) {
					PrintWriter clientWriter = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream())); //字符流  一行一行输出数据
					clientWriter.println(message);
					clientWriter.flush();
				}
				
				//6.给客户端发送消息
				/*Scanner scanner = new Scanner(System.in);
				System.out.println("服务端，请输入：");
				String sendMessage = scanner.nextLine();
				
				writer.println(sendMessage);
				writer.flush();*/
			}
		} catch (IOException e) {
			e.printStackTrace();
		}   
	}
}
