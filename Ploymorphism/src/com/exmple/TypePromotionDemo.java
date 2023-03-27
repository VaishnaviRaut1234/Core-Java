package com.exmple;

public class TypePromotionDemo 
{
	static double add(int a, double b)
	{
		System.out.println("Method 1");
		return (a+b);
	}
	static float add(long l, float b)
	{
		System.out.println("Method 2");
		return (l+b);
	}
	
	static int add(int a)
	{
		System.out.println("Method 3");
		return (a);
	}
	
	public static void main(String args[])
	{
		System.out.println(TypePromotionDemo.add(9, 7.8));
		
		System.out.println(TypePromotionDemo.add('a'));
		
		/*System.out.println(TypePromotionDemo.add(9, 7.8f));*/
	}
}
