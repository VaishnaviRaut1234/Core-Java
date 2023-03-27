package com.demo;

public class StudentDetails 
{
	int sId;
	String sName;
	int age;
	Course crs;
	
	public StudentDetails(int sId, String sName, int age)
	{
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
		
	}
	
	public void getStudentDetails(int sId,String sName, int age, Course crs)
	{
		this.sId = sId;
		this.sName = sName;
		this.age = age;
		this.crs=crs;
	}
	
	public void showStudentDetails()
	{
		System.out.println("sId=" + sId + ", sName=" + sName + ", age=" + age);
		this.crs.showCourse();
	}

	public int getSId() {
		return sId;
	}

	public void setSId(int sId) {
		this.sId = sId;
	}

	public String getSName() {
		return sName;
	}

	public void setName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setCourse(Course c)
	{
		crs=c;
	}
	public Course getC() {
		return crs;
	}

	public void setC(Course c) {
		this.crs = c;
	}

	@Override
	public String toString() {
		return "StudentDetails sId=" + sId + ", sName=" + sName + ", age=" + age;
	}

	
	
	
}
