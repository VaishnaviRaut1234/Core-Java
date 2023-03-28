package com.demo;

import java.util.Scanner;

public class Number 
{

	public static void main(String[] args) throws NumberNegativeException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number:");
		
		int num= sc.nextInt();
		try
		{
			
			if(num<0)
			{
				throw new NumberNegativeException("Number is negative");
			}
		  else
		  {
			  System.out.println("Number is positive");
		  }
		}
		catch(NumberNegativeException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
