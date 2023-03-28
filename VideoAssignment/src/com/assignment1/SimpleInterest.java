//Write a Java program to enter P, T, R and calculate Simple Interest.

package com.assignment1;

public class SimpleInterest 
{

	public static void main(String[] args) 
	{
		int p=5000;
		float t = 1.5f;
		float r = 2.5f;
		float SI;
		
		SI = (p*r*t)/100;
		
		System.out.println("Simple Interest "+SI);

	}

}
