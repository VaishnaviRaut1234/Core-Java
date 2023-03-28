//Write a Java program to enter P, T, R and calculate Simple Interest.

package com.variable;

import java.util.Scanner;

public class SimpleInterest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount");
		
		int p = sc.nextInt();
		
		System.out.println("Enter duration");
		double t = sc.nextDouble();
		
		System.out.println("Enter Rate of Interest");
		double r = sc.nextDouble();
		
		double interest = (p * r * t)/100;
		System.out.println("Simple Interest is "+interest);
	}

}
