package com.example;

public class Employee 
{
	int id;
	String name;
	float bsalary;
	float hra;
	float tra;
	float gsalary;
	
	Employee()
	{
		id=101;
		name="Vaishu";
		bsalary=50000f;
	}
	
	Employee(int id,String name,float bsalary,float hra,float tra,float gsa)
	{
		this.id=id;
		this.name=name;
		this.bsalary=bsalary;
	}
	
	public static void main(String[] args) 
	{
	
	}

}
