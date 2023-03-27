package com.assignment4;

public class Account 
{
	private long accountNo;
	private String customerName;

	Account()
	{
		System.out.println("I am in default constructor");
		accountNo = 102345;
		customerName = "Vaishnavi";
	}
	
	Account(int accountNo, String customerName)
	{
		System.out.println("I am in parameterized constructor");
		this.accountNo=accountNo;
		this.customerName=customerName;
	}
	void showDetails()
	{
		System.out.println(accountNo+" "+customerName);
	}
	public static void main(String[] args) 
	{
		Account a = new Account();
		a.showDetails();
		Account a1 = new Account(1056,"Rahul");
		a1.showDetails();
		
		
		
	}

}
