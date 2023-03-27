package com.overriding;

class BankDetail
{
	protected float rate;
	
	public float rate()
	{
		return rate;
	}

	public float getRate() {
		return rate;
	}
	public void setRate() {
		rate = 0;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
	
}
class Canra extends BankDetail
	{
		public void setRate()
		{
			rate=8;
		}
	}
	
	class SBI extends BankDetail
	{
		public void setRate()
		{
			 rate = 7.5f;
		}
	}


public class Bank 
{
	public static void main(String[] args) 
	{
		Canra c1 = new Canra();
		c1.setRate();
		System.out.println(c1.getRate());

		SBI s1 = new SBI();
		s1.setRate();
		System.out.println(s1.getRate());
	}
}
