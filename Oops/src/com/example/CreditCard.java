package com.example;

public class CreditCard 
{
	public void useCard()
	{
		System.out.println("I am using creditcard for transaction");
	}
}

class DebitCard
{
	public void useCard(int amt)
	{
		System.out.println("I am using debitcard for transaction of RS. "+amt);
	}
}