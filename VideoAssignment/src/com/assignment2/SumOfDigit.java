//Write a java program to find sum of digits in any number. e.g. number is 435 sum is 12

package com.assignment2;

import java.util.Scanner;

public class SumOfDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int sum =0;
		
		while(num>0)
		{
			int n = num%10;
			sum+=n;
			num=num/10;
		}
		System.out.println("Sum of digit is "+sum);
	}

}
