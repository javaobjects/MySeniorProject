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
		创建JDBC应用程序的步骤:
			0.项目右键-新建lib文件夹-将classes12.jar或者ojdbc14.jar复制到文件夹-classes12.jar右键-build path - add to build path
			1.载入JDBC驱动程序
			2.定义连接URL
			3.建立连接
			4.创建Statement对象
			5.执行查询或更新
			6.结果处理
			7.关闭连接
			
		Statement:
			1.执行静态SQL语句
			2.有SQL注入风险
			
		PreparedStatement:
			1.预编译SQL语句
			2.解决SQL注入风险
			
		CallableStatement:
			1.执行存储过程
	 */
	public static void main(String[] args) {
		EmpStatementDao dao = new EmpStatementDao();
		
		//查询
		List<Emp> empList = dao.selectEmps();
		for (Emp emp : empList) {
			System.out.println(emp.toString());
		}
	}
	/**
	 * 查询所有的员工信息
	 * @return
	 */
	public List<Emp> selectEmps() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//1.载入JDBC驱动程序
			Class.forName("oracle.jdbc.driver.OracleDriver");//驱动描述符  oracle.jdbc.driver.OracleDriver
			
			//2.定义连接URL  jdbc:oracle:thin:@<主机IP>:1521:<数据库服务名>
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
			//3.建立连接
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(conn);
			
			//4.创建Statement对象
			stat = conn.createStatement();
			
			//5.执行查询或更新
			//stat.execute("sql");       //如果第一个结果为 ResultSet 对象，则返回 true；如果其为更新计数或者不存在任何结果，则返回 false 
			//stat.executeQuery("sql");  //返回查询的结果集合ResultSet，适用于查询（select）
			//stat.executeUpdate("sql"); //返回DML操作的影响行数，适用于新增（insert）、修改(update)、删除(select)
			//stat.executeBatch();       //返回int[],使用批量删除、批量修改、批量新增
			
			String empno = "8888 or 1=1 "; //SQL注入风险
			rs = stat.executeQuery("select empno, ename empName, job, mgr, hiredate, sal, comm, deptno from emp where empno =" + empno);
			//6.结果处理
			List<Emp> empList = new ArrayList<Emp>();
			while(rs.next())
			{
				//方式一：通过列索引index获取列的值
				//int empno = rs.getInt(1);       
				//String ename = rs.getString(2); 
				
				//方式二：通过列名称label获取列的值-----【推荐】
				//int empno = rs.getInt("empno");        
				//String ename = rs.getString("empName");
				
				//每遍历一次，获得一个Emp的员工信息
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("empName"));
				emp.setJob(rs.getString("job"));
				//...............其他字段（略）
				
				//将当前的emp添加到集合
				empList.add(emp);
			}
			
			return empList;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//7.关闭连接
			//使用顺序：Connection -> Statement -> ResultSet
			//关闭顺序：ResultSet -> Statement -> Connection
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
