package com.practice;

class B
{
	int a,b;
	
	B(int x, int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println(a+" "+b);
	}
}


public class Parameter 
{

	public static void main(String[] Brgs) 
	{
		B obj = new B(100, 200);
		obj.show();

	}

}
