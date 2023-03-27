package com.assignment4;

public class Student 
{
	private String name;
	private int age;
	private String address;
	
	public void setInfo(String name, int age)
	{
		name = "Vaishu";
		age = 56;
		System.out.println(name+" "+age);
	}
	
	public void setInfo(String name, int age,String address)
	{
		name = "Rahul";
		age =60;
		address = "Amravati";
		System.out.println(name+" "+age+" "+address);
	}
	
	
	
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setInfo("vaishu",8);
		
		s.setInfo("Shubham", 14, "Akola");
		
		
	}

}
