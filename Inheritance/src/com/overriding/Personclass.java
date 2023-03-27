package com.overriding;

class PersonDemo
{
	void display()
	{
		System.out.println("I am a person");
	}
}
	class Men extends PersonDemo
	{
		public void display()
		{
			System.out.println("I am a Men");
		}
	}
	
	class Women extends PersonDemo
	{
		public void display()
		{
			System.out.println("I am a Women");
		}
	}
	
	class Child extends PersonDemo
	{
		public void display()
		{
			System.out.println("I am a child");
		}
	}

public class Personclass 
{	
	public static void main(String[] args) 
	{
		PersonDemo m1;
		m1 = new Men();
		m1.display();
		
		m1 = new Women();
		m1.display();
		
	}

}
