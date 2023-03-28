package com.example;

class Name
{  
	Name()
	{
		System.out.println("My name is vaishnavi");
	}  
	
	Name(int n)
	{  
		this();  
		System.out.println(n);  
	}  
} 

public class ThisKeywordThree 
{  
		public static void main(String args[])
		{  
			Name a = new Name(10);  
		} 
	
}
