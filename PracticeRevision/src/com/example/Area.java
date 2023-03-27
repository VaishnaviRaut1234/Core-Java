package com.example;

public class Area 
{
	private int length;
	private int breadth;
	
	void area(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	void display()
	{
		int area = length * breadth;
		System.out.println("Area of rectangle is "+area);
	}
	public static void main(String[] args) 
	{
		Area a = new Area();
		
		a.area(8, 9);
		a.display();
	}

}
