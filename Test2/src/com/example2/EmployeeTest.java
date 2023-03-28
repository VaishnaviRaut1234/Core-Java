package com.example2;

import com.example.Employee;


public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		
		Employee e1 = new Employee();
		System.out.println(e1);
		System.out.println();
		Employee e2 = new Employee(1001,"Vaishnavi",21000,25);
		System.out.println(e2);
		System.out.println();
		Employee e3 = new Employee(1002,"Ashwini",15000,28,5);
		System.out.println(e3);
		System.out.println();
		Employee e4 = new Employee(1005,"Shubham",18000,26,1);
		System.out.println(e4);
	}
	
}
