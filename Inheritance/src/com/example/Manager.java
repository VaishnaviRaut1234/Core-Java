package com.example;

public class Manager extends Employee 
{
	private float exp;
	private float bonus;
	private String pos;
	
	public Manager()
	{
		
	}
	
	public Manager(float exp, float bonus, String pos)
	{
		this.exp=exp;
		this.bonus=bonus;
		this.pos=pos;
	}
	
	public String toString()
	{
		return exp+" "+bonus+" "+pos;
	}
	
	public static void main(String args[])
	{
		Manager m1 = new Manager();
		System.out.println(m1);
		
		Manager m2 = new Manager();
	}
}
