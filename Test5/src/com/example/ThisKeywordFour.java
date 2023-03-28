package com.example;

public class ThisKeywordFour 
{
	void m(ThisKeywordFour obj)
	{  
		  System.out.println("method is invoked");  
	}  
	void p()
	{  
		 m(this);  
	}  
	
	public static void main(String args[])
	{  
		ThisKeywordFour s = new ThisKeywordFour();  
		  s.p();  
	}  
		
}
