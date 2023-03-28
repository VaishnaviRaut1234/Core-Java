//Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)

package com.variable;

import java.util.Scanner;

public class TempFC 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		
		double Fahrenheit = sc.nextDouble();
		
		double Celsius = (Fahrenheit -32) * 5/9;
		
		System.out.println("Temperature in Celsius "+Celsius);

	}

}
