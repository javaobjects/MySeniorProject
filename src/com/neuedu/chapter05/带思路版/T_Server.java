package com.neuedu.chapter05.带思路版;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

//服务器
public class T_Server {

	//用于保存所有跟客户端聊天的socket对象
	static HashMap<Integer,Socket> socketMap = new HashMap<>();
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			//1.启动服务器
			ss = new ServerSocket(8888);
			System.out.println("服务器已启动....");
			
			int count = 1;
			while(true)
			{
				//2.等待客户端连接
				socket = ss.accept();//阻塞式方式，直到客户端连接进来，后续代码才能继续执行
				System.out.println("有新的客户端连接进来........" + socket.getInetAddress() + ":" + socket.getPort());
				
				//保存所有的socket
				socketMap.put(count++, socket);
				
				//开启一个线程专门负责与客户端聊天
				T_Server_Thread t1 =new T_Server_Thread(socket);
				t1.start();
				
				System.out.println(socketMap);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//8.关闭资源、释放资源
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
