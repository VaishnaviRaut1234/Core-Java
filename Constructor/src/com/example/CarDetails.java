package com.example;

public class CarDetails 
{

	public static void main(String[] args) 
	{
		Car c1 = new Car();
		c1.display();

		System.out.println("==============");
		Car c2 = new Car();
		c2.display();
		
		System.out.println("==============");
		Car c3 = new Car(11,"Tata Nexon",700000.0f);
		c3.display();
		
		
	}

}
