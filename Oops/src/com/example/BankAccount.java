package com.example;

public class BankAccount 
{
	private long accno;
	private String name;
	private float bal;
	
	public static String bankName = "ICICI Bank";
	public static float interest =7.2f;
	BankAccount()
	{
		
	}
	BankAccount(long a, String n, float b)
	{
		accno=a;
		name=n;
		bal=b;
		
	}
	
	void showDetails()
	{
		System.out.print("Cutsomer name "+name);
		System.out.print(" having Account Number  "+accno);
		System.out.println(" with balance is "+bal+" in bank "+BankAccount.bankName+" with rate of interest "+BankAccount.interest);
	}
	
}
