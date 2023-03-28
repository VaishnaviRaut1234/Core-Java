package com.example;

class Animaltwo
{  
	Animaltwo()
	{
		System.out.println("animal is created");
	}  
}  
	
class Dogs extends Animaltwo
{  
	Dogs()
	{  
		super();  
		System.out.println("dog is created");  
	}  
} 

public class SuperKeywordThree 
{	
	public static void main(String args[])
	{  
		Dogs d=new Dogs();  
	} 
}
