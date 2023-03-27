package com.string;

import java.util.Arrays;

public class SplitStringInTwo 
{
	public static void splitString(String s)
	{
		int l = s.length();
		int n=4;
		int noOfChar = l/n;
		
		String st[] = new String[n];
		int temp =0;
		if(l%n !=0)
		{
			System.out.println("Cannot divide it into equal parts");
		}
		else
		{
			for(int i=0;i<s.length();i+=noOfChar)
			{
				st[temp] = s.substring(i, i+noOfChar);
				temp++;
			}
			System.out.println(Arrays.toString(st));
		}
	}	
	public static void main(String[] args) 
	{
		String s = "My name is vaish";
		
		splitString(s);
	}

}
