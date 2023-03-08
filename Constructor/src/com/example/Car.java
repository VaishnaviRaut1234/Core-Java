package com.example;

public class Car 
{

	private int model;
	private String name;
	private float price;
	private String brand;
	
	public Car()
	{
		System.out.println("In default constructor");
		model=204;
		name="Tata Harrier";
		price=1480000.0f;
		brand="Tata";
	}
	
	public Car(int model, String name,float price,String brand)
	{
		this(model,name,price);
		System.out.println("In parameterize constructor1");
		
	}
	public Car(int model,String name,float price)
	{
		
		System.out.println("In parameterize constructor2");
		this.model=model;
		this.name=name;
		this.price=price;
		this.brand="TVS";
	}
	
	
	public void display()    //method
	{
		System.out.println(model+" "+name+" "+price+" "+brand);
	}

}
