//Write a Java program to enter length and breadth of a rectangle and find its area.

package com.variable;
import java.util.Scanner;

public class AreaRectangle 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of a rectangle");
		int length = sc.nextInt();
		
		System.out.println("Enter a breadth of a rectangle");
		int breadth = sc.nextInt();
		
		int area = length * breadth ;
		
		System.out.println("Area is " +area);
	}
}
