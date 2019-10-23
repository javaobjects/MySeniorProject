package com.neuedu.chapter07.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.chapter07.jdbc.entity.Emp;

public class EmpCallableStatementDao {

	/**
		����JDBCӦ�ó���Ĳ���:
			0.��Ŀ�Ҽ�-�½�lib�ļ���-��classes12.jar����ojdbc14.jar���Ƶ��ļ���-classes12.jar�Ҽ�-build path - add to build path
			1.����JDBC��������
			2.��������URL
			3.��������
			4.����Statement����
			5.ִ�в�ѯ�����
			6.�������
			7.�ر�����
			
		Statement:
			1.ִ�о�̬SQL���
			2.��SQLע�����
			
		PreparedStatement:
			1.Ԥ����SQL���
			2.���SQLע�����
			
		CallableStatement:
			1.ִ�д洢����
	 */
	public static void main(String[] args) {
		EmpCallableStatementDao dao = new EmpCallableStatementDao();
		
		//��ѯ
		dao.selectEmps();
	}
	/**
	 * ��ѯ���е�Ա����Ϣ
	 * @return
	 */
	public void selectEmps() {
		Connection conn = null;
		CallableStatement stat = null;
		ResultSet rs = null;
		try {
			//1.����JDBC��������
			Class.forName("oracle.jdbc.driver.OracleDriver");//����������  oracle.jdbc.driver.OracleDriver
			
			//2.��������URL  jdbc:oracle:thin:@<����IP>:1521:<���ݿ������>
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
			//3.��������
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(conn);
			
			/**
			 * 4.����CallableStatement����
			 * 		create or replace procedure my_pro(p_empno in emp.empno%type,p_ename out emp.ename%type)
					as
					begin
					       select ename into p_ename from emp where empno = p_empno;
					end;
			 */
			stat = conn.prepareCall("{call my_pro(?,?)}");//�﷨"{call �洢��������(�����б�....)}"
			
			//-------4.1 ORA-01008: �������б������Ѱ�
			stat.setInt(1, 6666);//������1��ʼ������һ���ʺŸ�ֵ  �������
			stat.registerOutParameter(2, Types.VARCHAR);//ע�����
			
			//5.ִ�в�ѯ�����
			rs = stat.executeQuery();
			
			//6.�������
			//System.out.println(rs.getString(2));  //not ok
			//System.out.println(stat.getString("p_ename"));//not ok
			System.out.println(stat.getString(2));//ok ͨ����������ȡ���Σ���ֻ�ܵ���stat�еķ���������ʹ��rsֱ�ӻ�ȡ���
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//7.�ر�����
			//ʹ��˳��Connection -> Statement -> ResultSet
			//�ر�˳��ResultSet -> Statement -> Connection
			try {
				if(rs != null)
				{
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(stat != null)
				{
					stat.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null)
				{
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//return null;
	}
}
