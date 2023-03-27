package com.exmple;

public class Account 
{
	private long accno;
	private String emailid;
	private String name;
	private float amount;
	
	public void setAccno(long accno)
	{
		this.accno=accno;
	}
	
	public long getAccno()
	{
		return accno;
	}
	
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	
	public String getEmailid()
	{
		return emailid;
	}
	
	public void setName(String name)
	{
	this.name = name;	
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAmount(float amount)
	{
		this.amount=amount;
	}
	
	public float getAmount()
	{
		return amount;
	}
	
}
