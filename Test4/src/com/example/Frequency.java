package com.example;

import java.util.Scanner;

public class Frequency 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");	//number
		int n = sc.nextInt();
		System.out.println("Enter a number");	
		int d = sc.nextInt();		//check frequency
		
		int f = 0;
		while (n > 0)
		{

			if (n % 10 == d)
				f++;

			n = n / 10;
		}
		System.out.println(d+" "+f);
	}
}
