package com.polymorphism;

public class GeometryShapes 
{
	public void area(int s)
	{
		int area = s *s;
		System.out.println("area of square is : "+area);
	}
	public void area(float r)
	{
		float area = 3.14f*r*r;
		System.out.println("area of circle is : "+area);
	}
	public void area(int w, int l)
	{
		int area = w * l;
		System.out.println("area of rectangle is : "+area);
	}
	
	public static void main(String args[])
	{
		GeometryShapes s = new GeometryShapes();
		s.area(5.1f);
		s.area(5);
		s.area(5, 6);
	}
}
