package com.example;

public class Test 
{
	public static void main(String[] args) 
	{
		
		Author a1 = new Author(101,"Vaishu","At Amravati", new Book(1,"Bhagwatgita",543f));
		Author a2 = new Author(102,"Ashu","At Paratwada",new Book(2,"How to become IAS",432f));
		
		
		System.out.println(a1);
		System.out.println(a2);
	}
}
