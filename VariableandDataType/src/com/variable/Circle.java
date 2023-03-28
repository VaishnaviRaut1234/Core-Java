//Write a Java program to enter radius of a circle and find its diameter, circumference and area.

package com.variable;
import java.util.Scanner;
public class Circle 
{

	public static void main(String[] args) 
	{
		double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a circle");
		int radius = sc.nextInt();
		
		int diameter = 2 * radius;
		System.out.println("Diameter of a circle is "+diameter);
		
		double circumference = 2 * PI * radius;
		System.out.println("Circumference of circle is "+circumference);
		
		double area = PI * radius * radius;
		System.out.println("Area of circle is "+area);

	}

}
