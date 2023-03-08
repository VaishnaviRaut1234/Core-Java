package com.practice;

class A
{
	int a;
	String name;
	
	A()		//constructor
	{
		a =88;		//initialization
		name="vaishu";
	}
	void show()		//method
	{
		System.out.println(a+" "+name);
	}
}

public class Demo {

	public static void main(String[] args) 
	{
		A obj = new A();
		obj.show();
				
	}

}
