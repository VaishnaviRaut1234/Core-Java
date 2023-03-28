package com.test;

public class Testdemo 
{
	String name;
	String location;
	float salary;
	
	public Testdemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Testdemo(String name, String location, float salary) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Testdemo [name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}

	
}
