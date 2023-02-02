//Write a Java program to input electricity consumption unit and calculate total electricity bill according to the given condition.

package com.conditional;

import java.util.Scanner;

public class ElectricityBill 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units");
		
		int units = sc.nextInt();
		double bill;
		
		if(units<=50)
		{
			bill = 0.50*units;
			System.out.println("Bill = "+bill);
		}
		else if(units<=150)
		{
			bill = 25 +(units-50)*0.75;
			System.out.println("Bill = "+bill);
		}
		else if(units<=250)
		{
			bill = 100+(units-150)*1.20;
			System.out.println("Bill = "+bill);
		}
		else
		{
			bill = 220 + (units-250)*1.50;
			System.out.println("Bill = "+bill);
		}

	}

}
