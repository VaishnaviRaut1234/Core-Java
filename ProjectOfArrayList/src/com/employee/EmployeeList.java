package com.employee;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList 
{
	public static void main(String args[]) 
	{
		ArrayList<Employee> slist = new ArrayList<>();
		slist.add(new Employee(101,"Vaishu",98000,21));
		slist.add(new Employee(102,"Nikhil",95000,36));
		slist.add(new Employee(103,"Shubham",74000,25));
		slist.add(new Employee(104,"Ashu",91000,30));
		slist.add(new Employee(105,"Ajinkya",74000,24));
		slist.add(new Employee(106,"Ajinkya",74000,27));
		
		for(Employee s:slist)
		{
			System.out.println(s);
		}
		
		Collections.sort(slist);
		System.out.println("***********************");
		for(Employee s:slist)
		{
			System.out.println(s);
		}
		/*Collections.reverse(slist);
		System.out.println("***********************");
		for(Employee s:slist)
		{
			System.out.println(s);
		}*/
	}
}
