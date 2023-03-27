package com.example;

public class Account 
{
	long accno;
	String name;
	float balance;
	
	void insert()
	{
		accno = 5687101;
		name = "Vaishnavi";
		balance = 50000;
	}
	
	void dispaly()
	{
		System.out.println(accno+" "+name+" "+balance);
	}
	float deposit()
	{
		float amount=7000;
		balance +=amount;
		System.out.println("Amount added is "+amount+" Now, Account balance is "+balance);
		return balance;
	}
	
	float withdraw()
	{
		float amt = 5000;
		balance -= amt;
		System.out.println("Amount withdraw is "+amt+" Now, Account balance is "+balance);
		
		return balance;
	}
	public static void main(String[] args) 
	{
		Account a = new Account();
		
		a.insert();
		
		a.dispaly();
		System.out.println("-----------------------");
		a.deposit();
		System.out.println("------------------------");
		a.withdraw();
	}

}
