package com.revise;

public class Account 
{
	public long accno;
	public String customername;
	
	Account()
	{
		System.out.println("I am in default constructor");
		accno=5678;
		customername="Shubham";
	}
	
	Account(long a, String n)
	{
		System.out.println("I am in parameterized constructor");
		accno = a;
		customername = n;
	}
	void display()
	{
		System.out.println(accno+" "+customername);
	}
	
	public static void main(String[] args) 
	{
		Account a = new Account(3456, "Vaishnavi");
		
		a.display();
		System.out.println("****************************");
		Account a1 = new Account();
		a1.display();
	}
	
}
