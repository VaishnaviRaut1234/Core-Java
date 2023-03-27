package com.example;

public class Movie 
{
	//Variables or properties
	int yearOfRelase;
	float profit;
	String actorName , producerName;
	
	//Behavior or methods
	//returnType methodName(parameters) { }
	
	void acceptDetails(int y, float p, String pr, String a)
	{
		yearOfRelase = y;
		profit = p;
		producerName = pr;
		actorName = a;
	}
	
	void showDetails()
	{
		System.out.println("Moive relase in "+yearOfRelase);
		System.out.println("Moive profit is "+profit);
		System.out.println("Producer Name is "+producerName);
		System.out.println("Actor Name is "+actorName);
	}
	
	public static void main(String args[])
	{
		Movie m = new Movie();		//object creation by using new keyword.
		// variable declaration = memory allocation.
		
		m.showDetails();		//calling method show details.
		m.acceptDetails(1997, 586.2f,"Johnes","Akshay");
		System.out.println();
		System.out.println("After calling accept details");
		m.showDetails();
		System.out.println();
		Movie m1 = new Movie();		//create another object.
		m1.acceptDetails(1998, 5845.5f, "sdjvs" , "Salman");
		m1.showDetails();
	}
	
}



