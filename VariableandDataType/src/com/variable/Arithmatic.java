//Write a Java program to enter two numbers and perform all arithmetic operations.

package com.variable;
import java.util.Scanner;

public class Arithmatic 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a second number");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Sum is "+sum);
		
		int sub = num1 - num2;
		System.out.println("Sub is "+sub);
		
		int mul = num1 * num2;
		System.out.println("Mul is "+mul);
		
		int div = num1/num2;
		System.out.println("Div is "+div);
		
	}

}
