package com.assignment4;

public class Cycle 
{
	private int accNo;
	private int numberOfWheel;
	
	Cycle()
	{
		this(234,4);
		System.out.println("I am in default constructor");
		//accNo = 6789;
		//numberOfWheel = 4;
	
	}
	Cycle(int accNo, int numberOfWheel)
	{
		System.out.println("I am another constructor");
		this.accNo=accNo;
		this.numberOfWheel=numberOfWheel;
		
	}
	void shwDetails()
	{
		System.out.println(accNo+ " "+numberOfWheel);
	}
	public static void main(String args[])
	{
		Cycle c = new Cycle();
		c.shwDetails();
		Cycle c1 = new Cycle(1023,2);
		c1.shwDetails();
		
	}
	
}
