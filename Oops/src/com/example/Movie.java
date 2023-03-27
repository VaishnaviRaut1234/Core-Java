package com.example;

public class Movie 
{
	int yearOfRelase;
	float profit;
	String actorName, producerName;
	
	Movie()			//Default constructor
	{
		yearOfRelase=1882;
		profit=4536f;
		actorName="Salman Khan";
		producerName="Mr.james";
	}
	
	Movie(int y, float p, String acname, String prname)			//parameterize constructor
	{
		yearOfRelase=y;
		profit=p;
		actorName=acname;
		producerName=prname;
	}
	
	void acceptDetails(int y, float p, String aname, String pname)
	{
		yearOfRelase =  y;
		profit = p;
		actorName = aname;
		producerName = pname;
	}
	
	public void showdata()
	{
		System.out.println("Movie release in "+yearOfRelase);
		System.out.println("Movie profit is "+profit);
		System.out.println("Movie Actor is "+actorName);
		System.out.println("Movie profit is "+producerName);
		
	}
	public static void main(String args[])
	{
		Movie titanic = new Movie();		//object created
		//titanic.acceptDetails(1197,5674.3f,"leo","Mr.james");
		System.out.println("Titanic movie details");
		titanic.showdata();
		System.out.println("----------------");
		
		
		Movie uri = new Movie(1995,58745.36f,"Akshay","Ragul");
		System.out.println("URI movie details");
		//uri.acceptDetails(1995,58745.36f,"Akshay","Ragul");
		uri.showdata();
	}
}
