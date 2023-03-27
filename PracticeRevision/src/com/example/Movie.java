package com.example;

public class Movie 
{
	int yearOfRelease;
	float profit;
	String actorName , producerName;
	
	void acceptDetails()
	{
		yearOfRelease = 1997;
		profit = 45678.56f;
		actorName = "Akshay Kumar";
		producerName = "Ekta Kapur";
	}
	
	void showDetails()
	{
		System.out.println("Year of release is "+yearOfRelease);
		System.out.println("Profit of movie is "+profit);
		System.out.println("Actor is "+actorName);
		System.out.println("Producer is "+producerName);
	}
	
	public static void main(String[] args) 
	{
		Movie m = new Movie();
		
		//m.acceptDetails();
		m.showDetails();
	}

}
