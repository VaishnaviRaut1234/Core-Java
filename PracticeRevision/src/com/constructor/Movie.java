package com.constructor;

public class Movie 
{
	int yearOfRelease;
	float profit;
	String actorName , producerName;
	
	Movie()
	{
		//this(1887, 89654f,"Salman","J.K.Khan");		//constructor chaining.
		this(1887, 89654f);	
		actorName = "Mr.james";
		producerName = "Akshay Kumar";
		/*yearOfRelease=1997;
		profit = 54847f;
		actorName = "Mr.james";
		producerName = "Akshay Kumar";*/
		
	}

	Movie(int yearOfRelease, float profit)
	{
		this.yearOfRelease=yearOfRelease;
		this.profit = profit;
	}
	Movie(int yearOfRelease, float profit, String actorName, String producerName)
	{
		this.yearOfRelease=yearOfRelease;
		this.profit = profit;
		this.actorName = actorName;
		this.producerName = producerName;
	}
	
	void showDetails()
	{
		System.out.println("Year of release is "+this.yearOfRelease);
		System.out.println("Profit of movie is "+this.profit);
		System.out.println("Actor is "+this.actorName);
		System.out.println("Producer is "+this.producerName);
	}
	public static void main(String[] args) 
	{
		Movie m = new Movie();  
		m.showDetails();
		/*System.out.println("--------------------------------");
		Movie m1 = new Movie(1887, 89654f,"Salman","J.K.Khan");
		m1.showDetails();*/
	}

}
