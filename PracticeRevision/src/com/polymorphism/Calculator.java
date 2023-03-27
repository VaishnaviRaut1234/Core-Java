package com.polymorphism;

public class Calculator 
{
	
	public static void main(String[] args) 
	{
		NumberOperations num = new NumberOperations();
		num.addNumbers(8, 9);
		num.addNumbers(5, 7.2f);
		num.addNumbers(6, 8, 9.2f);
	}

}
