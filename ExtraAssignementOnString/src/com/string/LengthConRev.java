package com.string;

public class LengthConRev 
{
	public static void length(String s)
	{
		int count=0;
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println("Length of the string is "+count);

	}
	
	public static void concate(String s1, String s2)
	{
		String s3 = s1+s2;
		
		System.out.println(s3);
	}
	
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
		String s1 = "I love my country.";
		
		String s2= "My country name is India.";
		
		length(s1);
		length(s2);
		
		System.out.println("-----------------------------------");
		
		concate(s1,s2);
		
		System.out.println("------------------------------------");
		System.out.println("Original String is : ");
		System.out.println(s1);
		System.out.println("Reverse String is : ");
		reverse(s1);
		System.out.println("--------------------------------------");
		System.out.println("Original String is : ");
		System.out.println(s2);
		System.out.println("Reverse String is : ");
		reverse(s2);
	}

}
