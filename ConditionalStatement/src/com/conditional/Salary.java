// Write a Java program to input basic salary of an employee and calculate its Gross salary.

package com.conditional;

import java.util.Scanner;

public class Salary 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a salary");
		
		int salary = sc.nextInt();
		double hra , da;
		if(salary<=10000)
		{
			hra = salary * 0.02;
			da = salary * 0.08;
			System.out.println("HRA is "+hra);
			System.out.println("DA is "+da);
		}
		else if(salary<=20000)
		{
			hra = salary * 0.25;
			da = salary * 0.9;
			System.out.println("HRA is "+hra);
			System.out.println("DA is "+da);
		}
		else if(salary>2000)
		{
			hra = salary * 0.3;
			da = salary * 0.95;
			System.out.println("HRA is "+hra);
			System.out.println("DA is "+da);
		}
	}

}
