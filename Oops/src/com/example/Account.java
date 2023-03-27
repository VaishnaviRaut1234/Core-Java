package com.example;

public class Account 
{
	private long accno;
	private String name;
	private float bal;
	
	public long getAccno()
	{
		return accno;
	}
	
	public void setAccno(long accno)
	{
		this.accno = accno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public float getBal()
	{
		return bal;
	}
	public void setBal(float bal)
	{
		this.bal= bal;
	}
	
	public void acceptDetails(int acno, String n, float b)
	{
		accno = acno;
		name = n;
		bal = b;
	}
}
