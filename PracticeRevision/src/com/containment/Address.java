package com.containment;

public class Address 
{
	private int pinCode,serno;
	private String socity, city;
	
	public void setPinCode(int pinCode)
	{
		this.pinCode=pinCode;
	}
	
	public int getPinCode()
	{
		return pinCode;
	}
	
	public void setSerno(int serno)
	{
		this.serno=serno;
	}
	
	public int getSerno()
	{
		return serno;
	}
	
	public void setSocity(String socity)
	{
		this.socity=socity;
	}
	
	public String getSocity()
	{
		return socity;
	}
	
	public void setCity(String city)
	{
		this.city=city;
	}
	
	public String getCity()
	{
		return city;
	}
	public Address()
	{
		
	}
	
	public Address(String socity , int serno, String city,  int pinCode)
	{
		this.pinCode=pinCode;
		this.serno=serno;
		this.socity=socity;
		this.city = city;
	}
	
	public void showAddress()
	{
		System.out.println(serno+" "+socity+" "+city+" "+pinCode);
	}
}
