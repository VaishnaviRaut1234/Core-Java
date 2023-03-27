package com.exmple;

import java.util.Scanner;

public class Company 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id");
		e1.setId(sc.nextInt());
		
		System.out.println("Enter Name");
		e1.setName(sc.next());
		
		System.out.println("Enter Salary");
		e1.setSalary(sc.nextFloat());
		
		System.out.println("Enter Id");
		e2.setId(sc.nextInt());
		
		System.out.println("Enter Name");
		e2.setName(sc.next());
		
		System.out.println("Enter Salary");
		e2.setSalary(sc.nextFloat());
		
		
		
		System.out.println("---------------");
		System.out.println("Id :"+e1.getId());
		System.out.println("Name :"+e1.getName());
		System.out.println("Salary :"+e1.getSalary());
		
		System.out.println("---------------");
		System.out.println("Id :"+e2.getId());
		System.out.println("Name :"+e2.getName());
		System.out.println("Salary :"+e2.getSalary());

	}

}
