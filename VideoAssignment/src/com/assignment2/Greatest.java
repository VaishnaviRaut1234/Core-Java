//Write a java program to find maximum number from given 3 numbers.

package com.assignment2;

public class Greatest 
{

	public static void main(String[] args) 
	{
		int a = 56;
		int b = 76;
		int c = 23;
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater");
		}
		else if(b>c)
		{
			System.out.println(b+" is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}

	}

}
