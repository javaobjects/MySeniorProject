package com.neuedu.chapter03.io��.���л�;

public class Test���_ǳ���� {

	/**
	  		ǳ��������¡����ʱ�������¡���ö�������ԣ����磬�����¡Student��StudentClass
	  		
	  		�������¡����ʱ�����¡���ö�������ԣ����磬���¡Student��StudentClass
	  		
	  			1. �������л�Ĭ�������
	  			
	  			2. ����������Ҫ������
	  				�� ʵ�������¡�Ľӿ�
	  					public class Student implements Cloneable{}
	  					
	  				�� ��дclone����
	  					protected Object clone() throws CloneNotSupportedException {
							Student stuClone = (Student)super.clone();
							
							StuClass stuClassClone = (StuClass)stuClone.getStuClass().clone();
							stuClone.setStuClass(stuClassClone);
							
							return stuClone;
						}
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		/**
		 * ԭ����
		 */
		StuClass stuClass = new StuClass(125, "Java8��");
		Student jinquan = new Student(10000, "��Ȩ", 18, "��", "�������125C",stuClass);
		
		/**
		 * ��¡����
		 */
		Student jinquanClone = (Student)jinquan.clone();
		
		//�����������Student�ĵ�ַ
		System.out.println(jinquan.hashCode());     //2059712038
		System.out.println(jinquanClone.hashCode());//143833026
		
		jinquanClone.setSex("Ů");
		
		System.out.println("ԭ���Ľ�Ȩ��" + jinquan.getSex());     //��
		System.out.println("�����Ľ�Ȩ��" + jinquanClone.getSex());//Ů
		
		//�����������StudentClass�ĵ�ַ
		System.out.println(jinquan.getStuClass().hashCode());     //143833026
		System.out.println(jinquanClone.getStuClass().hashCode());//143833026
		
		jinquanClone.getStuClass().setCname("Java8�����");
		
		System.out.println("ԭ���Ľ�Ȩ��" + jinquan.getStuClass().getCname());     //Java8�����
		System.out.println("�����Ľ�Ȩ��" + jinquanClone.getStuClass().getCname());//Java8�����
	}
}
