package com.employee;

public class Employee implements Comparable<Employee>
{
	private int id,age;
	private String name;
	private float salary;
	
	
	public Employee() {
		super();
		
	}
	public Employee(int id, String name, float salary,int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age=age;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() 
	{
		return "Student id=" + id + ", name=" + name + ", Salary =" + salary+", Age = "+age;
	}
	
	
	public int compareTo(Employee o) {
		
		if(salary==o.salary)
		{
			return 0;
		}
		else if(salary>o.salary)
		{
			
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
