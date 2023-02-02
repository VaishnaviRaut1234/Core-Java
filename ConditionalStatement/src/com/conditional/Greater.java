////Write a Java program to find maximum between three numbers.

package com.conditional;

import java.util.Scanner;

public class Greater 
{

	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number");
		int num3 = sc.nextInt();
		
		int greater = (num1>num2)?(num1>num3?num1:num2):(num2>num3?num2:num3);
		
		System.out.println("Greatest number is "+greater);
	}

}
