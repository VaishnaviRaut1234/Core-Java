package com.example;

import java.util.Scanner;

public class Prime 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(num==0 && num==1)
		{
			System.out.println(num+" is not prime number");
		}
		else if(num%2==0)
		{
			System.out.println(num+" is not prime number.");
		}
		else
		{
			System.out.println(num+" is prime number.");
		}

	}

}
