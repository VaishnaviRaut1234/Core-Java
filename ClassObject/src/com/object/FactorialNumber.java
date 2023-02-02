package com.object;

public class FactorialNumber
{
	static long factorial(int num)
	{
		
		long i,fact=1;  
		  for(i=2;i<=num;i++)
		  {    
			    
			  fact*=i;
			 
		  }  
		  return fact;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Factorial is "+factorial(5));
		System.out.println("Factorial is "+factorial(55));

	}
	
}
