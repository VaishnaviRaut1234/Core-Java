package com.test;

public class Course 
{
	String cName;
	int fees;
	
	
	public Course() {
		super();
		
	}
	
	public Course(String cName, int fees) {
		super();
		this.cName = cName;
		this.fees = fees;
	}

	public String getcName() 
	{
		return cName;
	}
	public void setcName(String cName) 
	{
		this.cName = cName;
	}
	public int getFees() 
	{
		return fees;
	}
	public void setFees(int fees) 
	{
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course cName=" + cName + ", fees=" + fees;
	}
	
	
}
