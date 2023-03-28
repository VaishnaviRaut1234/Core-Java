package com.example;

class Student
{  
	int rollno;  
	String name;  
	int marks;  
	Student(int rollno,String name,int marks)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.marks=marks;  
	}  

void display()
	{
		System.out.println(rollno+" "+name+" "+marks);
	}  
} 


public class ThisKeywordOne 
{

	public static void main(String[] args) 
	{
			Student s1=new Student(101,"Vaishu",50);  
			Student s2=new Student(102,"Ashu",60);  
			s1.display();  
			s2.display();  
			 

	}

}
