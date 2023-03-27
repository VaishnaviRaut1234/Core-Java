package com.constructor;

public class Student 
{
	private int rollNo;
	private String name;
	private int marksPhysics;
	private int marksChemistry;
	private int marksMaths;
	
	Student()
	{
		this(101,"Vaishu", 86,81,45);
	}
	
	Student(int rollNo, String name, int marksPhysics, int marksChemistry, int marksMaths)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marksPhysics=marksPhysics;
		this.marksChemistry=marksChemistry;
		this.marksMaths=marksMaths;
	}
	
	void showDetails()
	{
		System.out.println(rollNo+" "+name+" "+marksPhysics+" "+marksChemistry+" "+marksMaths);
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.showDetails();
	}

}
