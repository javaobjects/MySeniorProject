package com.neuedu.chapter07.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.chapter07.jdbc.entity.Emp;

public class EmpStatementDao {

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
		EmpStatementDao dao = new EmpStatementDao();
		
		//��ѯ
		List<Emp> empList = dao.selectEmps();
		for (Emp emp : empList) {
			System.out.println(emp.toString());
		}
	}
	/**
	 * ��ѯ���е�Ա����Ϣ
	 * @return
	 */
	public List<Emp> selectEmps() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//1.����JDBC��������
			Class.forName("oracle.jdbc.driver.OracleDriver");//����������  oracle.jdbc.driver.OracleDriver
			
			//2.��������URL  jdbc:oracle:thin:@<����IP>:1521:<���ݿ������>
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
			//3.��������
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(conn);
			
			//4.����Statement����
			stat = conn.createStatement();
			
			//5.ִ�в�ѯ�����
			//stat.execute("sql");       //�����һ�����Ϊ ResultSet �����򷵻� true�������Ϊ���¼������߲������κν�����򷵻� false 
			//stat.executeQuery("sql");  //���ز�ѯ�Ľ������ResultSet�������ڲ�ѯ��select��
			//stat.executeUpdate("sql"); //����DML������Ӱ��������������������insert�����޸�(update)��ɾ��(select)
			//stat.executeBatch();       //����int[],ʹ������ɾ���������޸ġ���������
			
			String empno = "8888 or 1=1 "; //SQLע�����
			rs = stat.executeQuery("select empno, ename empName, job, mgr, hiredate, sal, comm, deptno from emp where empno =" + empno);
			//6.�������
			List<Emp> empList = new ArrayList<Emp>();
			while(rs.next())
			{
				//��ʽһ��ͨ��������index��ȡ�е�ֵ
				//int empno = rs.getInt(1);       
				//String ename = rs.getString(2); 
				
				//��ʽ����ͨ��������label��ȡ�е�ֵ-----���Ƽ���
				//int empno = rs.getInt("empno");        
				//String ename = rs.getString("empName");
				
				//ÿ����һ�Σ����һ��Emp��Ա����Ϣ
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("empName"));
				emp.setJob(rs.getString("job"));
				//...............�����ֶΣ��ԣ�
				
				//����ǰ��emp��ӵ�����
				empList.add(emp);
			}
			
			return empList;
			
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
		
		return null;
	}
}
