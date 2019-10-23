package com.neuedu.chapter05.带思路版;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class T_Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			//3.连接服务器
			socket = new Socket("127.0.0.1",8888);//localhost 127.0.0.1表示本机    也可以写具体的IP地址
		
			//4.给服务器发送消息
			T_Client_Thread_Send sendThread = new T_Client_Thread_Send(socket);
			sendThread.start();
			
			//7.接收服务器消息
			T_Client_Thread_Receive receiveThread = new T_Client_Thread_Receive(socket);
			receiveThread.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//8.关闭资源、释放资源
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
