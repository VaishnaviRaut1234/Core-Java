package com.example;

public class Employee 
{
	private int id;
	private String name;
	private float salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	public float getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		
		e.setId(101);
		e.setName("Vaishu");
		e.setSalary(58000f);
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
	}

}
