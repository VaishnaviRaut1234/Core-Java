package com.example;

class area
{
	float area(float r)
	{
		float a = (float) (3.14 * r * r);
		System.out.println("Area of circle is : "+a);
		return a;
	}
	
	 int area(int s)
	{
		int a = (s*s);
		System.out.println("Area of square is : "+a);
		return a;
	}
	
	 int area(int length, int width)
	{
		int a = length * width;
		System.out.println("Area of restangle is : "+a);
		return a;

	}
}
public class Shapes {
	
	public static void main(String[] args) 
	{
		area ob = new area();
		
		ob.area(5);
		ob.area(5,7);
		ob.area(5.7f);
	}

}
