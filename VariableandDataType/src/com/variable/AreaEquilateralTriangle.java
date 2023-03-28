//Write a Java program to calculate area of an equilateral triangle.

package com.variable;

import java.util.Scanner;

public class AreaEquilateralTriangle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a triangle ");
		
		int side = sc.nextInt();
		
		double area = (1.73 * side * side) /4;
		
		System.out.println("area of equilateral triangle is "+area);

	}

}
