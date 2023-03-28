package com.example;

import java.util.Scanner;

public class Extract 
{
	public static void extract(int n)
	{
		int temp=n,digit;
		
		while(n>0)
		{
			n=n/10;
			
		}
		while(temp>0)
		{
			digit = temp%10;
			System.out.print(digit+" ");
			temp=temp/10;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		extract(num);
		
	}

}
