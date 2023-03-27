package com.example;

public class ArithmaticOperation 
{
	int num1 , num2;
	int add(int num1, int num2)
	{
		int sum = num1 +num2;
		System.out.println(num1+" + "+num2+" = "+sum);
		return sum;
	}
	
	int sub(int num1 , int num2)
	{
		int sub = num1 - num2;
		System.out.println(num1+" - "+num2+" = "+sub);
		return sub;
	}
	
	int mul(int num1, int num2)
	{
		int m = num1*num2;
		System.out.println(num1+" * "+num2+" = "+m);
		return m;
	}
	
	int div(int num1 , int num2) 
	{
		int division = num1/num2;
		System.out.println(num1+"/"+num2+" = "+division);
		return division;
	}
	public static void main(String[] args) 
	{
		ArithmaticOperation  a = new ArithmaticOperation();
		
		a.add(5, 9);
		a.sub(46, 12);
		a.mul(12, 6);
		a.div(85, 5);
	}

}
