package com.neuedu.chapter05.带思路版;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//客户端：接收消息线程
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
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//字符流  一行一行读取数据
				String message = reader.readLine();
				
				System.out.println("服务端说：" + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
