package com.neuedu.chapter03.io��.���л�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamAndObjectOutputStream {

	/**
		���л������� -> �ֽ����У�������ת��Ϊ�ֽ����У����Ա����ڱ����ļ���Ҳ����������֮������֮�䴫�ݶ���
		
		�����л��� �ֽ����� -> �����ֽ����лָ�Ϊ����
		
		ע�⣺
			1.��Ҫʵ�����еĶ��󣬱���ʵ�����л��ӿ�Serializable����Externalizable
				public class Student implements Serializable{}
				public class StuClass implements Serializable{}
				
			2.��������Ѿ�ʵ�����л��ӿڣ�������Բ�����ʵ��
				public class Person implements Serializable{}
				public class Student extends Person{}
				
			3.�������е�����ʾ����serialVersionUID���������л��뷴���л��ж϶����Ƿ�Ϊͬһ����
				private static final long serialVersionUID = -6873608134389523921L;
				
			4.transient �������Բ������л���ȥ
				private transient String address;
	 */
	public static void main(String[] args) {
		/**
		 * new����
		 */
		StuClass stuClass = new StuClass(125, "Java8��");
		Student jinquan = new Student(10000, "��Ȩ", 18, "��", "�������125C",stuClass);
		
		/**
		 * ���л�
		 */
		serialize(jinquan);
		
		/**
		 * �����л�
		 */
		deSerialize();
		
	}
	/**
	 * �����л�
	 */
	private static void deSerialize() {
		ObjectInputStream input = null;
		try {
			//����������
			FileInputStream in = new FileInputStream("file/student.txt");
			input = new ObjectInputStream(in);
			
			//��ȡ����
			Student jinquanClone = (Student)input.readObject();
			System.out.println(jinquanClone.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
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
	 * ���л������� -> �ֽ�����
	 * @param �����л��Ķ���
	 */
	private static void serialize(Student stu) {
		ObjectOutputStream output = null;
		try {
			//���������
			FileOutputStream out = new FileOutputStream("file/student.txt");
			output = new ObjectOutputStream(out);
			
			//������д���ļ�
			output.writeObject(stu);
			
			//ˢ���ݴ���
			output.flush();
			
			System.out.println("���л��ɹ�����");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
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
