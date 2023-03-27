package com.overriding;

class Person
{
	void display()
	{
		System.out.println("I am a person");
	}
}
	class Employee extends Person
	{
		public void display()
		{
			System.out.println("I am a working person");
		}
	}
	
	class Home extends Person
	{
		public void display()
		{
			System.out.println("I am a Home person");
		}
	}

public class OverridingDemo 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.display();

		Home h1 = new Home();
		h1.display();
	}
}


