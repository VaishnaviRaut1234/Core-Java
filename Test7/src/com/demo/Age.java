package com.demo;

import java.util.Scanner;

public class Age 
{
	public static void main(String args[]) throws InvalidAgeException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age:");
		
		int age= sc.nextInt();
		try
		{
			
			if(age<18)
			{
				throw new InvalidAgeException("Invalid voting age");
			}
		  else
		  {
			  System.out.println("You are eligible for vote");
		  }
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
