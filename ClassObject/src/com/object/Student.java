package com.object;

public class Student 
{
	
	private int rollno;
	String name;
	protected float marks;
	public int age;
	
	private void doPrivate()
	{
		System.out.println("Private method implemented");
	}
	
	protected void doProtected()
	{
		System.out.println("protected method implemented");
	}
	public void doPublic()
	{
		System.out.println("public method implemented");
	}

}
