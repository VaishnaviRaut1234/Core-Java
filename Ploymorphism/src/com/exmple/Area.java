package com.exmple;

public class Area
{
	int side;
	float radius;
	int length , breadth;
	double base , height,area;
	static float pi = 3.14f;
	
	static void enterDetails(float radius)
	{
		System.out.println(pi* radius * radius);

	}
	
	static void enterDetails(int side)
	{
		System.out.println(side * side);
		
	}
	static void enterDetails(int length , int breadth)
	{
		System.out.println(length * breadth);
	}
	static void enterDetails(double base , double height)
	{
		System.out.println((base * height)/2);
		
	}
	
	public static void main(String[] args) 
	{
		Area.enterDetails(2.5f);
		Area.enterDetails(2);
		Area.enterDetails(3,5);
		Area.enterDetails(25.0f,56.0f);

	}

}
