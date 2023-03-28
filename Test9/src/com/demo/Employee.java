package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Employee 
{
	int id;
	String name;
	float salary;
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, float salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getSalary() 
	{
		return salary;
	}
	public void setSalary(float salary) 
	{
		this.salary = salary;
	}
	@Override
	public String toString() 
	{
		return "\nEmployee id=" + id + ", name=" + name + ", salary=" + salary;
	}
	
	public static void main(String[] args)
	{
		List<Employee> list= new ArrayList<Employee>();
		
		Employee e1 = new Employee(101,"Vaishu",5600f);
		list.add(e1);
		list.add(new Employee(101,"Rahul",50000f));
		list.add(new Employee(101,"Nikhil",60000f));
		list.add(new Employee(101,"Shubham",55000f));
		list.add(new Employee(101,"Ajinkya",30000f));
		System.out.println(list);
		
	
		
	}
}
