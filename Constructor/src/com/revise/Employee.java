package com.revise;

public class Employee 
{
	private int empId;
	private String name;
	private float salary;
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public int getEmpId()
	{
		return empId;
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
		
		e.setEmpId(101);
		e.setName("Vaishnavi");
		e.setSalary(45284.4f);
		
		System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getSalary());
	}

}
