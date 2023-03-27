package com.example;

public class GooglePay 
{
	public void transferAmout(int amount, Account ac1)
	{
		System.out.println("Transaction in process...");
		float balance = ac1.getBal();
		//ac1.setBal(ac1.getBal()-amount);
		
		ac1.setBal(balance-amount);
		System.out.println("Amount transfered successfully."
				+"\n Updated balnace of Account no. "+ac1.getAccno()+" is Rs. "+ac1.getBal());
	}
	
	public static void main(String[] args) 
	{
		Account obj = new Account();
		obj.acceptDetails(7894, "Vaishu", 50000);
		 
		GooglePay t1 = new GooglePay();
		t1.transferAmout(5000, obj);
	}

}
