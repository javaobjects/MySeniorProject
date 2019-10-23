package com.neuedu.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//服务器
public class Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			//1.启动服务器
			ss = new ServerSocket(8888);
			System.out.println("服务器已启动....");
			
			//2.等待客户端连接
			socket = ss.accept();//阻塞式方式，直到客户端连接进来，后续代码才能继续执行
			System.out.println("有新的客户端连接进来........" + socket.getInetAddress() + ":" + socket.getPort());
			
			//5.接收客户端发送的消息
			InputStream in = socket.getInputStream();				//字节流   一个字节一个字节读取数据
			InputStreamReader inReader = new InputStreamReader(in); //字符流  一个字符一个字符读取数据
			BufferedReader reader = new BufferedReader(inReader);   //字符流  一行一行读取数据
			
			String message = reader.readLine();
			System.out.println("客户端说：" + message);
			
			//6.给客户端发送消息
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream())); //字符流  一行一行输出数据
			writer.println("你好，我不在，请留言！！！");
			writer.flush();
			
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
