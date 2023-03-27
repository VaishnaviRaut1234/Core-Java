package com.example;

public class Student {
	
	int id;
	String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	void assignValue()
	{
		id = 101;
		name = "Vaishu";
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.getId());
		
	}

}
