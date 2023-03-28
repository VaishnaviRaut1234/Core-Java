//Write a Java program to enter base and height of a triangle and find its area.

package com.variable;

import java.util.Scanner;

public class AreaTriangle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base of a triangle");
		
		int base = sc.nextInt();
		
		System.out.println("Enter height of a triangle");
		
		int height = sc.nextInt();
		
		double area = (base * height)/2;
		
		System.out.println("Area of triangle is "+area);
		

	}

}
