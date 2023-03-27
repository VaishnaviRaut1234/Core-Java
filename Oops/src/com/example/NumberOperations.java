package com.example;

public class NumberOperations 
{
	public void addNumbers(int x, int y, float z)
	{
		System.out.println("Addition on three number is "+(x+y+z));
	}
	public int addNumbers(int x, int y)
	{
		return (x+y);
	}
	public void addNumbers(int x, float y)
	{
		System.out.println("Addition on two number is "+(x+y));
	}
	public void calculateArea(float r) 
	{
		System.out.println("Area of circle is "+(3.14*r*r));
	}
	public void calculateArea(int w, int l) 
	{
		System.out.println("Area of rectangle is "+(w*l));
	}
	public void calculateArea(int s) 
	{
		System.out.println("Area of square is "+(s*s));
	}
}
