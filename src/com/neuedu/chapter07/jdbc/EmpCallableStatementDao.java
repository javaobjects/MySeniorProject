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
		EmpCallableStatementDao dao = new EmpCallableStatementDao();
		
		//查询
		dao.selectEmps();
	}
	/**
	 * 查询所有的员工信息
	 * @return
	 */
	public void selectEmps() {
		Connection conn = null;
		CallableStatement stat = null;
		ResultSet rs = null;
		try {
			//1.载入JDBC驱动程序
			Class.forName("oracle.jdbc.driver.OracleDriver");//驱动描述符  oracle.jdbc.driver.OracleDriver
			
			//2.定义连接URL  jdbc:oracle:thin:@<主机IP>:1521:<数据库服务名>
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
			//3.建立连接
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(conn);
			
			/**
			 * 4.创建CallableStatement对象
			 * 		create or replace procedure my_pro(p_empno in emp.empno%type,p_ename out emp.ename%type)
					as
					begin
					       select ename into p_ename from emp where empno = p_empno;
					end;
			 */
			stat = conn.prepareCall("{call my_pro(?,?)}");//语法"{call 存储过程名称(参数列表....)}"
			
			//-------4.1 ORA-01008: 并非所有变量都已绑定
			stat.setInt(1, 6666);//索引从1开始，给第一个问号赋值  传入入参
			stat.registerOutParameter(2, Types.VARCHAR);//注册出参
			
			//5.执行查询或更新
			rs = stat.executeQuery();
			
			//6.结果处理
			//System.out.println(rs.getString(2));  //not ok
			//System.out.println(stat.getString("p_ename"));//not ok
			System.out.println(stat.getString(2));//ok 通过列索引获取出参，且只能调用stat中的方法，不能使用rs直接获取结果
			
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
		
		//return null;
	}
}
