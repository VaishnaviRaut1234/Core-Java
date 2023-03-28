//Write a Java program to enter two numbers and find their sum.

package com.variable;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Sum is = "+sum);

	}

}
