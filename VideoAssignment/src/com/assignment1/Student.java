//10.Write a Java program to enter marks of five subjects and calculate total and Percentage.

package com.assignment1;

public class Student 
{

	public static void main(String[] args) 
	{
		int sub1=56;
		int sub2=78;
		int sub3=89;
		int sub4=45;
		int sub5=67;
		
		int total = sub1+sub2+sub3+sub4+sub5;
		float per= total/5.0f;
		
		System.out.println("Total marks is "+total);
		System.out.println("Percentage is "+per);

	}

}
