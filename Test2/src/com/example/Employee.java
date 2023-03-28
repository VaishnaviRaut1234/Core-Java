package com.example;

public class Employee 
{
	private int id;
	private String name;
	private float salary;
	private int age;
	private int experience;
	
	public Employee()
	{
		System.out.println("In default constructor");
		this.id=9;
		this.name="vaishnavi";
		this.salary=9825.0f;
		this.age=45;
		this.experience=15;
		
	}
	public Employee(int id,String name,float salary,int age)
	{
		System.out.println("In parameterize constructor1");
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.experience=0;
	}
	public Employee(int id,String name,float salary,int age,int experience)
	{
		System.out.println("In parameterize constructor2");
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.experience=experience;
	}
	
	
	public int getId() {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String toString()
	{		return "Employee Details : "+id+" "+name+" "+salary+" "+age+" "+experience;
	}
}
