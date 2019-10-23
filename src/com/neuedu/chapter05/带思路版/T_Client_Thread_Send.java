package com.neuedu.chapter05.带思路版;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//客户端：发送消息线程
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
				PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));//字符流  一行一行输出数据
	
				Scanner scanner = new Scanner(System.in);
				System.out.println("客户端，请输入：");
				String sendMessage = scanner.nextLine();
				
				writer.println(sendMessage);
				writer.flush();
				
				//判断如果客户端输入"exit"，表客户端准备退出
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
