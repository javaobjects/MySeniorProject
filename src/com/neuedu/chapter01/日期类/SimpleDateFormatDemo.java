package com.neuedu.chapter01.������;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		/**
		 * format���� ���� -> ָ����ʽ���ַ���
		 * 
		 * 		M �·�
		 *      m ����
		 *      H 24Сʱ��
		 *      h 12Сʱ��
		 *      E ����
		 *      a ���
		 */
		Date now = new Date();
		System.out.println(now);//Thu Sep 05 11:21:19 CST 2019
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//���ݿ� yyyy-mm-dd hh24:mi:ss
		String strDate = sdf.format(now);
		System.out.println(strDate);//2019-09-05 11:23:39
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//���ݿ� yyyy-mm-dd hh24:mi:ss
		String strDate2 = sdf2.format(now);
		System.out.println(strDate2);//2019/09/05 11:24:20
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss E a");//���ݿ� yyyy-mm-dd hh24:mi:ss
		String strDate3 = sdf3.format(now);
		System.out.println(strDate3);//2019��09��05��  11:28:10  ������  ����
		
		/**
		 * parse���� ָ����ʽ���ַ��� -> ����
		 */
		String str = "2019-09-05 11:25:21";
		System.out.println(sdf.parse(str));//Thu Sep 05 11:25:21 CST 2019
		
		String str2 = "2019/09/05 11:25:21";
		System.out.println(sdf2.parse(str2));//Thu Sep 05 11:25:21 CST 2019
		
		String str3 = "2019��09��05��  11:25:21 ������ ����";
		System.out.println(sdf3.parse(str3));//Thu Sep 05 11:25:21 CST 2019
	}

}
