package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest 
{
	    public static void main(String[] args)
	    {
	        
	        ArrayList<Employee> list = new ArrayList<Employee>();
	        list.add(new Employee(32200, "Vaishnavi", 21));
	        list.add(new Employee(32200, "Ashu", 28));
	        list.add(new Employee(82100, "Rahul", 16));
	        list.add(new Employee(25100, "Ajinkya", 26));
	        list.add(new Employee(57200, "Shubham", 24));
	 
	  
	        System.out.println("After sorting(sorted by Salary)");
	        System.out.println("Age" + " " + "Name" + " " + "Salary");
	 
	        // call the sort function
	        Collections.sort(list, new SalaryComparator());
	        for (Employee employee : list) {
	            System.out.println(employee.age + " " + employee.name + " "  + employee.salary);
	        }
	        
	    }
	}


