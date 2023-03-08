package com.customer;

public class CustomerDetails 
{

	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		Customer c2 = new Customer(1001,"Vaishnavi","9898076545");
		Customer c3 = new Customer(1001,"Rahul","TV",9890,"Installment","9899907655");
		System.out.println(c1);
	}

}
