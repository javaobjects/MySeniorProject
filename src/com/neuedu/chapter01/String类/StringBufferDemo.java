package com.neuedu.chapter01.String��;

public class StringBufferDemo {

	public static void main(String[] args) {
		/**
		 * 1.��������
		 */
		//����һ�����в����ַ����ַ�������������ʼ����Ϊ 16 ���ַ�
		StringBuffer sb = new StringBuffer();
		
		//����һ�������ַ���������ָ����ʼ�������ַ���������
		StringBuffer sb2 = new StringBuffer(70);
		
		// ����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ�������
		StringBuffer sb3 = new StringBuffer("abc");
		
		/**
		 * 2.���÷���
		 */
		//capacity() �鿴�ַ���������������
		System.out.println("������" + sb.capacity());//16
		System.out.println("������" + sb2.capacity());//70
		System.out.println("������" + sb3.capacity());//19
		
		//append() ׷���ַ���
		//sb = sb + "123" + "true";//String�����ַ���ƴ�ӷ�ʽ
		sb.append("123").append(true).append("����");
		System.out.println(sb);//123true����
		
		String str = "----"; //���ɱ�
		str.concat("123").concat("true").concat("����");
		System.out.println(str);//----
		
		//delete(start,end) ɾ��ָ��������ַ�������������λ��
		sb.delete(3, 7);
		System.out.println(sb);//123����
		
		//deleteCharAt(index) ɾ��ָ���±�λ�õ��ַ�
		sb.deleteCharAt(2);
		System.out.println(sb);//12����
		
		//insert(offset,element) ��ָ��λ������һ��Ԫ��
		sb.insert(0, "����");
		System.out.println(sb);//����12����
		
		//replace(start,end,string) ��ָ��string�滻start~end�����ֵ
		sb.replace(0, 2, "add");
		System.out.println(sb);//add12����
		
		StringBuffer tele = new StringBuffer("13312347890");
		tele.replace(3, 7, "****");
		System.out.println(tele);
		
		//reverse() �ߵ��ַ���
		//sb.reverse();
		//System.out.println(sb);//����21dda
		
		//setCharAt(index,char) ��indexλ�õ��ַ��滻Ϊchar 
		sb.setCharAt(0, 'o');
		System.out.println(sb);//odd12����
		
		//toString() StringBuffer -> String
		System.out.println(sb.toString());
		
		/**
		 * ��Ҫ�ж�����StringBuffer�����������Ƿ���ȣ�Ӧ����toString����������ת����String����
		 */
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = new StringBuffer("abc");
		
		System.out.println(sb4 == sb5);     //false �Ƚϵ�ֵַ
		System.out.println(sb4.equals(sb5));//false û����дObject��equals������Ĭ�ϻ��ǱȽϵ�ֵַ
		
		//StringBuffer -> String֮���ٱȽ�
		String str4 = sb4.toString();
		String str5 = sb5.toString();
		
		System.out.println(str4 == str5);    //false �Ƚϵ�ֵַ
		System.out.println(str4.equals(str5));//true �ȱȽϵ�ֵַ���ٱȽ�����ֵ
		
		/**
		 * String��StringBuffer������
		 * 		��ͬ�㣺
		 * 			1.���Ǳ�ʾ�ַ�����
		 *          2.������java.lang���е��࣬����Ҫ�����
		 * 
		 * 	           ��ͬ�㣺
		 * 			1.String�ǲ��ɱ���ַ�����
		 * 			2.StringBuffer�ǿɱ��ַ�����
		 * 			3.StringBuffer��ʡ�ڴ濪��
		 */
		String str6 = "abc";
		str6 = str6 + "123";//abc123
		str6 = str6 + "true";//abc123true
		
		//abc  abc123  abc123true
		
		StringBuffer sb6 = new StringBuffer("abc");
		sb6.append("123");//abc123
		sb6.append("true");//abc123true
		
		//abc123true
	}
}
