package com.test;

import java.util.Comparator;

public class Employee 
{
	int salary;
    String name;
    int age;
    Employee(int salary, String name, int age)
    {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }
    
}
 

class SalaryComparator implements Comparator<Employee> {
    
    public int compare(Employee list1, Employee list2)
    {
        if (list1.salary == list2.salary) {
            return 0;
            
        }
        else if (list1.salary < list2.salary) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
 
