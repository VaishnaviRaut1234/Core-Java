//Write a Java program to check whether a number is negative, positive or zero.

package com.conditional;

import java.util.Scanner;

public class Number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println(num+" is positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" is negative number");
		}
		else
		{
			System.out.println(num+" is zero");
		}
	}

}
