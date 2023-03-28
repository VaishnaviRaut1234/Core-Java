package com.example;

public class Test 
{

	public static void main(String[] args) 
	{
		int Marks;
		String sub;
		
		Marks = 65;
		sub="chem";
		
		if(Marks>80)
		{
			System.out.println("Distinction");
		}
		else if(Marks>70)
		{
			System.out.println("First");
		}
		else if(Marks>60 && sub=="physics")
		{
			System.out.println("Pass");
				
		}
		else if(Marks>60)
		{
			System.out.println("Special Pass");
		}
		

	}

}
