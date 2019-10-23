package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		//addAll(collection,....elements)��N����Ԫ��
		ArrayList list = new ArrayList();
		Collections.addAll(list, "abc",123,true,"����");
		
		System.out.println(list);//[abc, 123, true, ����]

		//copy(dest,src) ������Ԫ�ش�src���Ƶ�dest
		ArrayList src = new ArrayList();
		Collections.addAll(src, 1,2,3,4,5);
		
		ArrayList dest = new ArrayList();       
		Collections.addAll(dest, 6,7,8,9,10,11);
		
		System.out.println("����ǰsrc��" + src); //[1, 2, 3, 4, 5]
		System.out.println("����ǰdest��" + dest);//[6, 7, 8, 9, 10, 11]
		
		Collections.copy(dest, src);
		
		System.out.println("���ƺ�src��" + src); //[1, 2, 3, 4, 5]
		System.out.println("���ƺ�dest��" + dest);//[1, 2, 3, 4, 5, 11]
		
		//addAll���� ��dest��Ԫ��ȫ�����Ƶ�src
		src.addAll(dest);
		System.out.println("addAll���ƺ�src��" + src); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
		System.out.println("addAll���ƺ�dest��" + dest);//[1, 2, 3, 4, 5, 11]
		
		//fill()ʹ��ָ��Ԫ����伯��
		//Collections.fill(list, null);
		//System.out.println(list);//[null, null, null, null]
		
		//max() ��ȡ����������Ԫ��,���뱣֤����Ԫ��Ϊͬһ����
		System.out.println(Collections.max(src));//11
		
		//min() ��ȡ��������С��Ԫ��,���뱣֤����Ԫ��Ϊͬһ����
		System.out.println(Collections.min(src));//1
		
		//sort() Ĭ����������,���뱣֤����Ԫ��Ϊͬһ����
		ArrayList list2 = new ArrayList();       
		Collections.addAll(list2, 66,7,8,129,10,111);
		
		Collections.sort(list2);
		System.out.println(list2);//[7, 8, 10, 66, 111, 129]
		
		//reverse() �ߵ�Ԫ��˳��
		Collections.reverse(list2);
		System.out.println(list2);//[129, 111, 66, 10, 8, 7]
	}
	
}
