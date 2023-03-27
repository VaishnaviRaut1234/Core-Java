package com.example;

public class Calculator 
{
	public static void main(String args[])
	{
		NumberOperations o = new NumberOperations();
		System.out.println("Addition is "+o.addNumbers(9, 12));
		o.addNumbers(5, 2, 7);
		o.addNumbers(5, 17f);
		System.out.println("---------------------");
		o.calculateArea(5.6f);
		o.calculateArea(9);
		o.calculateArea(5, 7);
		
	}
}
