package com.neuedu.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			//3.连接服务器
			socket = new Socket("127.0.0.1",8888);//localhost 127.0.0.1表示本机    也可以写具体的IP地址
		
			//4.给服务器发送消息
			OutputStream out = socket.getOutputStream();               //字节流    一个字节一个字节输出数据
			OutputStreamWriter outWriter = new OutputStreamWriter(out);//字符流     一个字符一个字符输出数据
			PrintWriter writer = new PrintWriter(outWriter);           //字符流  一行一行输出数据
			
			writer.println("你好，在吗？");
			writer.flush();
			
			//7.接收服务器消息
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //字符流  一行一行读取数据
			String message = reader.readLine();
			System.out.println("服务端说：" + message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//8.关闭资源、释放资源
			try {
				if(socket != null)
				{
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
