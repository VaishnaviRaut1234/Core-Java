//Write a Java program to enter length in centimeter and convert it into meter and kilometer.

package com.variable;
import java.util.Scanner;

public class Length 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length in centemeter ");
		int cm = sc.nextInt();
		
		double m = cm * 0.01;
		System.out.println("Length in meter is "+m);
		
		double km = cm * 0.00001;
		System.out.println("Length in kilometer is "+km);

	}

}
