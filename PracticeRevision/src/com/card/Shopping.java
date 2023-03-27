package com.card;

public class Shopping 
{
	public void onlineTransaction(CreditCard c)
	{
		c.useCard();
	}
	
	public void onlineTransaction(DebitCard d)
	{
		d.useCard();
	}
	
	public static void main(String[] args) 
	{
		Shopping s = new Shopping();
		
		CreditCard cc = new CreditCard();
		
		s.onlineTransaction(cc);
		s.onlineTransaction(new DebitCard());
	}

}
