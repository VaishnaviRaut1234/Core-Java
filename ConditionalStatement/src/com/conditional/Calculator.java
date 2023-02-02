//Write a Java program to create Simple Calculator.

package com.conditional;

import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		double result =0;
		System.out.println("Enter a operator");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
		case '+' :
				result = num1 + num2;
				break;
		
		case '-' :
				result = num1 - num2;
				break;
				
		case '*' : 
				result = num1 * num2;
				break;
				
		case '/' : 
				result = num1/num2;
				break;
				
		}
		
		System.out.println(num1+" "+op+" "+num2+"= "+result);

	}

}
