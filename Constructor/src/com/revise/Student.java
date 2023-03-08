package com.revise;

public class Student 
{
	private int id;
	private String name;
	private int marks;
	private String school;
	
	Student()
	{
		System.out.println("I am in default constructor");
		this.id=101;
		this.name = "Vaishnavi";
		this.marks= 78;
		this.school="SGBAU";
	}
	
	Student(int id, String name)
	{
		System.out.println("I am in parameterized constructor 1");
		this.id=id;
		this.name=name;
	}
	
	Student(int id, String name, int marks)
	{
		System.out.println("I am in parameterized constructor 2");
		this.id=id;
		this.name= name;
		this.marks=marks;
	}
	
	Student(int id, String name,int marks, String school)
	{
		System.out.println("I am in parameterized constructor 3");
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.school=school;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+marks+" "+school);
	}
}
