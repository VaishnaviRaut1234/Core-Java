package com.string;

import java.util.Scanner;

public class Palindrome 
{
	public static void stringPalindrome(String s)
	{
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("String is palindrome.....");
		}
		else
		{
			System.out.println("String is not palindrome....");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		
		stringPalindrome(s);
	}

}
