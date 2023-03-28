//Write a Java program to convert days into years, weeks and days.

package com.variable;

import java.util.Scanner;

public class Days 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Days");
		
		int days = sc.nextInt();
		
		int year = days /365;
		System.out.println("Number of years are "+year);
		
		int temp = days%365;
		int month = temp/30;
		
		System.out.println("Number of months are "+month);
		
		int day = temp % 30;
		System.out.println("Number of days are "+day);

	}

}
