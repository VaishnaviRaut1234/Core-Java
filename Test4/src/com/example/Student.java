package com.example;

class CountStudent 
{
	static int count =0;
	
	String name;
	int marks;
	
	CountStudent(String name, int marks)
	{
		this.name=name;
		this.marks=marks;
	
		
		count++;
	}
}
public class Student
{
	public static void main(String s[])
	{
		CountStudent s1 = new CountStudent("Ashwini",34);
		CountStudent s2 = new CountStudent("Vaishu",94);
		
		System.out.println("No of student after second variable : "+CountStudent.count);
		
		CountStudent s3 = new CountStudent("Shubham",90);
		
		System.out.println("No of student after third variable: "+CountStudent.count);
	}
	
}

