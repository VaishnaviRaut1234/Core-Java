package com.staticvariable;

public class Account 
{
	private int accno;
	private String name;
	private float balance;
	
	public static String bankName;	// = "ICICI Bank";
	public static float rate;		//=3.5f;
	
	static
	{
		System.out.println("Static Block one Executed");
		bankName = "ICICI Bank";
	}
	
	{
		System.out.println("Instance block 1 is called");
		accno=4147;
		name = "Vaishu";
		
	}
	
	public static void changeRate(float newRate)
	{
		rate = newRate;
		
	}
	
	{
		System.out.println("Instance block 2 is called");
		balance=587453f;
	}
	
	Account()
	{
		System.out.println("Default constructor worked");
		accno = 0;
		name="";
		balance =0.0f;
	}
	
	Account(int accno, String name, float balance)
	{
		System.out.println("Parameterized constructor Worked");
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	static
	{
		System.out.println("Static Block two executed");
		rate=3.5f;
	}
	void showDetails()
	{
		System.out.println(accno+" "+name+" "+balance+" "+Account.bankName);
		System.out.println("Name of the bank is "+bankName);
		System.out.println("Interest rate is "+rate);
	}
}
