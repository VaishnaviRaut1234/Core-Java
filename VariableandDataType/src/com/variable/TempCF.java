//Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.

package com.variable;
import java.util.Scanner;

public class TempCF 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 1.8) +32;
		System.out.println("Temperatur in fahrenheit "+fahrenheit);
	}

}
