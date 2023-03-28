package com.example;

public class StringBufferBuilder 
{
	public static void timeBuffer(StringBuffer sb)
	{
		long startTime = System.currentTimeMillis();
		for(int i=0;i<1000;i++)
		{
			sb.append(false);
		}
	}
	public static void timeBuilder(StringBuilder sb)
	{
		
	}
	
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();
		
		StringBuffer s1 = new StringBuffer("java");
		timeBuffer(s1);
		
		StringBuilder s2 = new StringBuilder("java");
		timeBuilder(s2);
	}

}
