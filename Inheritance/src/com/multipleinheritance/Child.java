package com.multipleinheritance;

class Father
{
	float prop;
	
	Father()
	{
		prop = 7654.8f;
	}
	void displayProp()
	{
		System.out.println("Assests :"+prop);
	}
}

class Mother
{
	float prop;
	float jewels;
	
	Mother()
	{
		prop=8754.0f;
		jewels=674.8f;
	}
	
	void displayprop()
	{
		System.out.println("Assests :"+prop+jewels);
	}
}
public class Child
{

	public static void main(String[] args) {
		

	}

}
