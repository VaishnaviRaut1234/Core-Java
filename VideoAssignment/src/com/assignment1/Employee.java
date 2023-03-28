package com.assignment1;

import java.util.ArrayList;

public class Employee 
{
	int id;
	String name;
	float salary;
	
	Employee()
	{
		
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee(101,"Vaishu",25784f);
		Employee e2 = new Employee(102,"Suraj",25574f);
		Employee e3 = new Employee(103,"Rahul",25784f);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		if(e1.salary==e2.salary)
		{
			System.out.println("Employe "+e1.name+ " and "+e2.name+" have same salary");
			System.out.println(e1.id+" "+e1.name+" "+e1.salary);
			System.out.println(e2.id+" "+e2.name+" "+e2.salary);
		}
		else if(e1.salary==e3.salary)
		{
			System.out.println("Employe "+e1.name+ " and "+e3.name+" have same salary");
			System.out.println(e1.id+" "+e1.name+" "+e1.salary);
			System.out.println(e3.id+" "+e3.name+" "+e3.salary);
		}
		else if(e2.salary == e3.salary)
		{
			System.out.println("Employe "+e2.name+ " and "+e3.name+" have same salary");
			System.out.println(e1.id+" "+e1.name+" "+e1.salary);
			System.out.println(e2.id+" "+e2.name+" "+e2.salary);
			System.out.println(e3.id+" "+e3.name+" "+e3.salary);
		}
		else
		{
			System.out.println("All Employee salary are different");
			System.out.println(e2.id+" "+e2.name+" "+e2.salary);
			System.out.println(e3.id+" "+e3.name+" "+e3.salary);
		}
		
		
	}
}
