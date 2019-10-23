package com.neuedu.chapter01.String类;

public class StringBufferAndStringBuilder {
	/**
	 * StringBuffer和StringBuilder都是长度可变的字符串。
			1. 两者的操作基本相同。
			2. 两者的主要区别在于
				 StringBuffer类是线程安全的；
				 StringBuilder类是线程不安全的。
				 
				 StringBuffer在JDK1.0中就有，而StringBuilder是在JDK5.0后才出现的。
				
				 StringBuilder的一些方法实现要比StringBuffer快些。

	 */
	public static void main(String[] args) {
		
		/**
		 * 	StringBuffer:
		 * 			线程安全，效率慢，调用方法时，需要排队，适用于多线程
		 */
		long begin = System.currentTimeMillis();//获取当前系统时间的毫秒值
		
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < 20000000; i++) {
			stringBuffer.append(i);
		}
		
		long end = System.currentTimeMillis();//获取当前系统时间的毫秒值
		
		System.out.println("StringBuffer操作结束，所花时间（毫秒值）:" + (end - begin));//1600
		
		/**
		 * 	StringBuilder:
		 * 			线程不安全，效率高，调用方法时，不需要排队，适用于单线程
		 */
		/*long begin = System.currentTimeMillis();//获取当前系统时间的毫秒值
		
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 20000000; i++) {
			stringBuilder.append(i);
		}
		
		long end = System.currentTimeMillis();//获取当前系统时间的毫秒值
		
		System.out.println("StringBuilder操作结束，所花时间（毫秒值）:" + (end - begin));*///1100
		
	}
	
}
