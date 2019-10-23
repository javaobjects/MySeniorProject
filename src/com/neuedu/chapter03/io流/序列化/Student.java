package com.neuedu.chapter03.io流.序列化;

//学生类
public class Student extends Person implements Cloneable{

	private static final long serialVersionUID = -6873608134389523921L;
	
	//成员变量
	private int sid;
	private String sname;
	private int age;
	private String sex;
	private transient String address;//transient 保护属性不被序列化出去
	
	private StuClass stuClass;//复合属性
	
	//构造函数
	public Student()
	{
		
	}
	public Student(int sid, String sname, int age, String sex, String address, StuClass stuClass) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.stuClass = stuClass;
	}


	//访问器
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StuClass getStuClass() {
		return stuClass;
	}
	public void setStuClass(StuClass stuClass) {
		this.stuClass = stuClass;
	}
	
	//重写父类toString()
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", sex=" + sex + ", address=" + address
				+ ", stuClass=" + stuClass + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student stuClone = (Student)super.clone();
		
		StuClass stuClassClone = (StuClass)stuClone.getStuClass().clone();
		stuClone.setStuClass(stuClassClone);
		
		return stuClone;
	}
}
