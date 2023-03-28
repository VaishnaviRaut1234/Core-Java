//Write a Java program to enter two angles of a triangle and find the third angle

package com.variable;

import java.util.Scanner;

public class ThirdClass 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first angle");
		
		int ang1 = sc.nextInt();
		
		System.out.println("Enter second angle");
		
		int ang2 = sc.nextInt();
		
		int ang3 = 180 - (ang1 +ang2);
		
		System.out.println("Third angle "+ang3);
	}

}
