package com.demo;

import java.util.Scanner;

public class Student 
{
	public static void main(String[] args) throws MarksLessException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks :");
		
		int marks= sc.nextInt();
		try
		{
			
			if(marks<0 || marks>100)
			{
				throw new MarksLessException("Invalid marks");
			}
		  else
		  {
			  System.out.println("Your marks is "+marks);
		  }
		}
		catch(MarksLessException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
