package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		//addAll(collection,....elements)添N个加元素
		ArrayList list = new ArrayList();
		Collections.addAll(list, "abc",123,true,"中文");
		
		System.out.println(list);//[abc, 123, true, 中文]

		//copy(dest,src) 将所有元素从src复制到dest
		ArrayList src = new ArrayList();
		Collections.addAll(src, 1,2,3,4,5);
		
		ArrayList dest = new ArrayList();       
		Collections.addAll(dest, 6,7,8,9,10,11);
		
		System.out.println("复制前src：" + src); //[1, 2, 3, 4, 5]
		System.out.println("复制前dest：" + dest);//[6, 7, 8, 9, 10, 11]
		
		Collections.copy(dest, src);
		
		System.out.println("复制后src：" + src); //[1, 2, 3, 4, 5]
		System.out.println("复制后dest：" + dest);//[1, 2, 3, 4, 5, 11]
		
		//addAll（） 将dest的元素全部复制到src
		src.addAll(dest);
		System.out.println("addAll复制后src：" + src); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
		System.out.println("addAll复制后dest：" + dest);//[1, 2, 3, 4, 5, 11]
		
		//fill()使用指定元素填充集合
		//Collections.fill(list, null);
		//System.out.println(list);//[null, null, null, null]
		
		//max() 获取集合中最大的元素,必须保证数组元素为同一类型
		System.out.println(Collections.max(src));//11
		
		//min() 获取集合中最小的元素,必须保证数组元素为同一类型
		System.out.println(Collections.min(src));//1
		
		//sort() 默认升序排序,必须保证数组元素为同一类型
		ArrayList list2 = new ArrayList();       
		Collections.addAll(list2, 66,7,8,129,10,111);
		
		Collections.sort(list2);
		System.out.println(list2);//[7, 8, 10, 66, 111, 129]
		
		//reverse() 颠倒元素顺序
		Collections.reverse(list2);
		System.out.println(list2);//[129, 111, 66, 10, 8, 7]
	}
	
}
