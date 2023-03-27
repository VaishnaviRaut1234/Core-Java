package com.object;

class Demo
{
	int a = 10;
	String b="Vaishu";
	void show()		//method
	{
		System.out.println(a+" "+b);
	}
}
public class Test 
{
	public static void main(String args[])
	{
	Demo obj = new Demo();
	obj.show();
	}
}
