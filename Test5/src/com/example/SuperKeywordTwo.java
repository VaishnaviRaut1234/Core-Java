package com.example;

class Animalone
{  
	void eat()
	{
		System.out.println("eating...");
	}  
}  
	
class Dogone extends Animalone
{  
	void eat()
	{
		System.out.println("eating bread...");
	}  
	void bark()
	{
		System.out.println("barking...");
	}  
	void work()
	{  
		super.eat();  
		bark();  
	}  
}  

public class SuperKeywordTwo 
{
	public static void main(String args[])
	{  
		Dogone d=new Dogone();  
		d.work();
	}
}
