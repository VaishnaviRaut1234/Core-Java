package com.wrapper;

class First
{
	int value;
	
	Number printValue()
	{
		return value;
	}
}

class Second extends First
{
	int myval;
	
	Integer printValue()
	{
		return myval;
	}
}

class Third extends First
{
	float myval;
	
	Float printValue()
	{
		return myval;
	}
}

//Character is not a subclass of Number class.
/*class Fourth extends First
{
	char ch;
	
	Character printValue()
	{
		return ch;
	}
}*/

public class Wrapper 
{

	public static void main(String[] args) 
	{
		
			Second s1 = new Second();
			
			Integer n = s1.printValue();
			n=n+5;
			
			Third t1 = new Third();
			/*Number f = t1.printValue();
			f=(float)f+6.5f;*/
			
			Float f = t1.printValue();
			f=f+6.5f;
			
	}

}
