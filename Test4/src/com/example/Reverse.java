package com.example;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int n=0;
		while(num!=0)
		{
			int rem = num%10;
			n = (n*10)+rem;
			num=num/10;
		}
			System.out.println("The reverse number is "+n);
	}

}
