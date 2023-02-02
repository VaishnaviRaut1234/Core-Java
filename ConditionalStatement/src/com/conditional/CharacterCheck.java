//Write a Java program to input any character and check whether it is alphabet, digit or special character.

package com.conditional;

import java.util.Scanner;

public class CharacterCheck 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		
		char ch = sc.next().charAt(0);
		
		if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z'))
				{
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					{
						System.out.println(ch+" is vowel");
					}
					else
					{
						System.out.println(ch+" is cons");
					}
					//System.out.println(ch+" is alphabet");
				}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is Digit");
		}
		else
		{
			System.out.println(ch+" is special charachter");
		}
	}

}
