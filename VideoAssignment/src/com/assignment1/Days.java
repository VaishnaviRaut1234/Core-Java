//Write a Java program to convert days into years, weeks and days.

package com.assignment1;

public class Days 
{

	public static void main(String[] args) 
	{
		int num=764;
		int year, month;
		
		year=num/365;
		System.out.println("Year "+year);
		num=num%365;
		month=num/30;
		System.out.println("Month "+month);
		num=num%30;
		System.out.println("Days "+num);
	}

}
