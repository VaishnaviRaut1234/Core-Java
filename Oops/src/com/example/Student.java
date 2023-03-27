package com.example;

public class Student 
{
	String name;
	int rollNo;
	int marksPhysics;
	int marksChemistry;
	int marksMaths;
	
	Student()
	{
		rollNo=101;
		name="Vaishu";
		marksPhysics=96;
		marksChemistry=86;
		marksMaths=78;
	}
	Student(int rollNo, String name, int marksPhysics, int marksChemistry, int marksMaths)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marksPhysics=marksPhysics;
		this.marksChemistry=marksChemistry;
		this.marksMaths=marksMaths;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public String getName(String name)
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getMarksPhysics()
	{
		return marksPhysics;
	}
	public void setMarksPhysics(int marksPhysics)
	{
		this.marksPhysics=marksPhysics;
	}
	public int getMarksChemistry()
	{
		return marksChemistry;
	}
	public void setMarksChemistry(int marksChemistry)
	{
		this.marksChemistry=marksChemistry;
	}
	public int getMarksMaths()
	{
		return marksMaths;
	}
	public void setMarksMaths(int marksMaths)
	{
		this.marksMaths=marksMaths;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println("Student one Details");
		System.out.println(s1);

	}

}
