package com.example;

public class Shopping 
{

	
	public void doOnlineTransaction(CreditCard c)
	{
		c.useCard();
	}
	
	public void doOnlineTransaction(DebitCard d)
	{
		d.useCard(5600);
	}
	
	
	public static void main(String[] args) 
	{
		Shopping s = new Shopping();
		
		CreditCard cc = new CreditCard();
		
		s.doOnlineTransaction(cc);
		s.doOnlineTransaction(new DebitCard());
	}

}
