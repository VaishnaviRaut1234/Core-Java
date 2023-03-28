//Write a Java program to enter length and breadth of a rectangle and find its perimeter.

package com.variable;
import java.util.Scanner;

public class Perimeter 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of a rectangle");
		int length = sc.nextInt();
		
		System.out.println("Enter a breadth of a rectangle");
		int breadth = sc.nextInt();
		
		int perimeter = 2 * (length + breadth);
		
		System.out.println("Perimeter of rectangle is "+perimeter);
		

	}

}
