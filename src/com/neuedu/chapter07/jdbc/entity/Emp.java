package com.neuedu.chapter07.jdbc.entity;

import java.util.Date;

/**
 * ӳ�����ݿ�Emp���ʵ����
 */
public class Emp {

	/**Ա�����*/
	private int empno;
	/**Ա������*/
	private String ename;
	/**Ա��ְλ*/
	private String job;
	/**Ա���ϼ�����*/
	private int manager;
	/**Ա����ְ����*/
	private Date hiredate;
	/**Ա��нˮ*/
	private double salary;
	/**Ա������*/
	private double comm;
	/**���ڲ���*/
	private int deptno;

	/**�޲ι��캯��*/
	public Emp()
	{
		super();
	}
	
	/**�вι��캯��*/
	public Emp(int empno, String ename, String job, int manager, Date hiredate, double salary, double comm,
			int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.manager = manager;
		this.hiredate = hiredate;
		this.salary = salary;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	/**��������get��set������*/
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	/**��дObject�����toString����*/
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", manager=" + manager + ", hiredate="
				+ hiredate + ", salary=" + salary + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
}
