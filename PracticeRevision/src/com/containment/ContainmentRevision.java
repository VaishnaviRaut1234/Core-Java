package com.containment;

import java.util.Scanner;

public class ContainmentRevision 
{

	public static void main(String[] args) 
	{
		//Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee Name");
		String name = sc.nextLine();
		
		System.out.println("Enter employee ID");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Salary");
		float sal = sc.nextFloat();
		
		
		
		Address ad = new Address();
		System.out.println("Enter Address Details");
		System.out.println("Enter society name");
		sc.nextLine();
		String sname = sc.nextLine();
		
		System.out.println("Enter serve Number");
		int sNo = sc.nextInt();
		
		System.out.println("Enter city");
		String city = sc.next();
		
		System.out.println("Enter Pincode");
		int pin = sc.nextInt();
		Address ad1 =new Address(sname , sNo, city,pin);
		Employee e1 = new Employee(id,name,sal,ad);
		
		
		//ad.getAddressDetails(sname , sNo, city,  pin);
		e1.setAddress(ad1);
		
		//e1.getEmployeeDetails(id, name, sal, ad);
		e1.showEmpRecord();
	}

}
