package com.exmple;

public class TestAccount {

	public static void main(String[] args) 
	{
		Account a = new Account();
		
		a.setAccno(456765);
		a.setName("Vaishnavi");
		a.setEmailid("Vaishnavi@gnmail.com");
		a.setAmount(5000);
		
		System.out.println(a.getAccno()+" "+a.getName()+" "+a.getEmailid()+" "+a.getAmount());

	}

}
