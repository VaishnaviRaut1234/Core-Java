package com.example;

class ClassB
{
	private int value1;
	private String value2;
	
	public int getValue1()
	{
		return value1;
	}
	public void setValue1(int value1)
	{
		this.value1=value1;
	}
	public String getValue2()
	{
		return value2;
	}
	public void setValue2(String value2)
	{
		this.value2=value2;
	}
}


public class ClassA 
{

	public static void main(String[] args) 
	{
		ClassB obj = new ClassB();
		obj.setValue1(5);
		System.out.println("Value 1 is :"+obj.getValue1());
		
		obj.setValue2("Vaishu");
		System.out.println("Value 2 is :"+obj.getValue2());
	}

}
