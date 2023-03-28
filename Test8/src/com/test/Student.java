package com.test;

public class Student 
{
	int id; 
	String name; 
	Boolean isSpecial;
	Course c;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Boolean isSpecial, Course c) {
		super();
		this.id = id;
		this.name = name;
		this.isSpecial = isSpecial;
		this.c = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(Boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}

	Student[] arr = new Student[10];
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = new Student();
	}
	
}
}
