package com.example;

public class Overload 
{
	
	public static void First()   
	{   
	System.out.println("First method.");   //overloaded static method  
	}   
	
	public static void First(int x)   
	{   
	System.out.println("Overloaded First method.");   
	}   
	
	public static void main(String args[])   
	{   
	
	Overload.First();   
	Overload.First(160);   
	}   
}  

