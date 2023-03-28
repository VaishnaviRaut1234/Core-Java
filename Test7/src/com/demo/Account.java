package com.demo;

import java.util.Scanner;

public class Account  
{

	public static void main(String args[]) throws InvalidAccountException 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a balance");
		int bal = sc.nextInt();
		
		System.out.println("Enter Amount for withdraw:");
		int amt= sc.nextInt();
		try
		{
			
			if(bal<=0)
			{
				throw new InvalidAccountException("cannot withdraw the amount");
			}
			else if(bal>0)
			{
				if(bal<amt)
				{
					throw new InvalidAccountException("cannot withdraw the amount");
				}
			}
			else
			{
				System.out.println("Amount withdraw");
			}
		  
		}
		catch(InvalidAccountException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
