package com.demo;

class CreditCard implements Card
{
	private float bal;
	private float amt;
	
	public void payBill(float amount) 
	{
		if(this.bal-amount>0)
		{
			this.bal=this.bal-amt;
			System.out.println("Amount paid :"+amt);
		}
		
	}
	
}


public class Shopping {

	public static void main(String[] args) {
		

	}

}
