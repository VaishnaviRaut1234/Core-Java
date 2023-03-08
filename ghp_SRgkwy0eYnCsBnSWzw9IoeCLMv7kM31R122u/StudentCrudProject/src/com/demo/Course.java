package com.demo;

public class Course 
{
	private int cId;
	private String cName;
	private float fees;
	
	public Course(int cId, String cName, float fees)
	{
		super();
		this.cId = cId;
		this.cName = cName;
		this.fees = fees;
		
	}
	
	public int getCid() 
	{
		return cId;
	}
	public void setCId(int cId) 
	{
		this.cId = cId;
	}
	public String getcName() 
	{
		return cName;
	}
	public void setcName(String cName) 
	{
		this.cName = cName;
	}
	public float getFees() 
	{
		return fees;
	}
	public void setFees(float fees) 
	{
		this.fees = fees;
	}
	
	/*public void showCourse()
	{
		System.out.println("Id=" + cId + ", Name=" + cName + ", fees=" + fees);
	}*/
	@Override
	public String toString() {
		return "Id=" + cId + ", Name=" + cName + ", fees=" + fees;
	}
	
	
}