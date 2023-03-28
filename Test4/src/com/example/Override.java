package com.example;

public class Override 
{   
	
	public static void mul(int num1, int num2)   
	{   
		int mul=num1*num2;  
		System.out.println("The multilplication is: "+mul);   
	}   
	
	public void mul(int num1, int num2)   
	{   
		int mul=num1*num2;  
		System.out.println("The multilplication is: "+mul);   
	}   

	public static void main(String args[])   
	{   
	
		Override.mul(12, 90);   
	}   
}  
