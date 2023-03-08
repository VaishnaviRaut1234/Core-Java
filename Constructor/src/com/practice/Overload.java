package com.practice;

class C
{
	int a;
	int b;
	double c;
	C()
	{
		a=1400;
		b=582;
		c=789547;
	}
	
	C(int x)
	{
		a=x;
	}
	
	C(int y, double z)
	{
		b=y; c=z;
		
	}
}

public class Overload 
{

	public static void main(String[] args) 
	{
		C obj1 = new C();
		C obj2 = new C(10);
		C obj3 = new C(5,8);
		
		System.out.println(obj1.a+" "+obj1.b+" "+obj1.c);	//access using object
		System.out.println(obj2.a);							//access using object
		System.out.println(obj3.b+" "+obj3.c);				//access using object
		

	}

}
