package com.string;

import java.util.Scanner;

public class ReverseString 
{
	public static void reverse(String s)
	{
		char ch[] = s.toCharArray();
		
		char temp[]=new char[ch.length];
		int j=0;
		for(int i=(ch.length-1);i>=0;i--)
		{
			temp[j++]=ch[i];
		}
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=temp[i];
		}
		System.out.println(ch);

	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		reverse(s);
	}

}
