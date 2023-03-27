package com.demo;

public class Student 
{
	private int rollNo;
	public int admissionNo;
	int age;
	protected int courseId;
	
	void doPublic()
	{
		System.out.println("I am in public method");
		//this.admissionNo=admissionNo;
	}
	
	void doDefault()
	{
		System.out.println("I am in default method");
	}
	
	void doProtected()
	{
		System.out.println("I am in preotected Method");
	}
	
	void doPrivate()
	{
		System.out.println("I am in private method");
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.admissionNo=102;
		s.age=52;
		s.rollNo=2;  //we can access private member;
		s.courseId=105;
	}

}
