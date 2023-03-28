package com.example;

 class first 
{
	void vaishu()
	{
		System.out.println("My name is Vaishu");
	}  
	void ashu()
	{  
	System.out.println("My name is Ashu");  
	
	this.vaishu();  
	}  
}  
 public class ThisKeywordTwo
{
	public static void main(String args[])
	{  
		first s =new first();  
	
		s.ashu();  
	}
}  

