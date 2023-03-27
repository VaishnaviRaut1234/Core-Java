package com.demo;

enum Course
{
	JAVA(5000), DOTNET(7000),ORACLE(3000);
	
	int price;
	Course(int price)
	{
		this.price=price;
	}
	public static void main()
	{
		for(Course c:Course.values())
		{
			System.out.println(c+" "+c.price);
		}
	}
}
