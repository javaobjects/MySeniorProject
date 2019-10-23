package com.neuedu.chapter03.io流.序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamAndObjectOutputStream {

	/**
		序列化：对象 -> 字节序列，将对象转换为字节序列，可以保存在本地文件，也可以在网络之间或进程之间传递对象
		
		反序列化： 字节序列 -> 对象，字节序列恢复为对象
		
		注意：
			1.需要实现序列的对象，必须实现序列化接口Serializable或者Externalizable
				public class Student implements Serializable{}
				public class StuClass implements Serializable{}
				
			2.如果父类已经实现序列化接口，子类可以不用在实现
				public class Person implements Serializable{}
				public class Student extends Person{}
				
			3.建议所有的类显示声明serialVersionUID，用于序列化与反序列化判断对象是否为同一类型
				private static final long serialVersionUID = -6873608134389523921L;
				
			4.transient 修饰属性不被序列化出去
				private transient String address;
	 */
	public static void main(String[] args) {
		/**
		 * new对象
		 */
		StuClass stuClass = new StuClass(125, "Java8班");
		Student jinquan = new Student(10000, "锦权", 18, "男", "东软大厦125C",stuClass);
		
		/**
		 * 序列化
		 */
		serialize(jinquan);
		
		/**
		 * 反序列化
		 */
		deSerialize();
		
	}
	/**
	 * 反序列化
	 */
	private static void deSerialize() {
		ObjectInputStream input = null;
		try {
			//对象输入流
			FileInputStream in = new FileInputStream("file/student.txt");
			input = new ObjectInputStream(in);
			
			//读取对象
			Student jinquanClone = (Student)input.readObject();
			System.out.println(jinquanClone.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			try {
				if(input != null)
				{
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 序列化：对象 -> 字节序列
	 * @param 待序列化的对象
	 */
	private static void serialize(Student stu) {
		ObjectOutputStream output = null;
		try {
			//对象输出流
			FileOutputStream out = new FileOutputStream("file/student.txt");
			output = new ObjectOutputStream(out);
			
			//将对象写入文件
			output.writeObject(stu);
			
			//刷新暂存区
			output.flush();
			
			System.out.println("序列化成功！！");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			try {
				if(output != null)
				{
					output.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
