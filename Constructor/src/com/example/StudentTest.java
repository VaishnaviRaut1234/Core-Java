package com.example;

import java.util.Scanner;

public class StudentTest 
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id:");
	       int id= sc.nextInt();
	       System.out.println("Enter name:");
	       String name= sc.next();
	       System.out.println("Enter marks:");
	       int marks= sc.nextInt();
	       
		Student c1 = new Student(id,name,marks);
		System.out.println(c1);
	}
}
