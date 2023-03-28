package com.example;

import java.util.Scanner;

public class GuessNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n= 5;
		int count =3;
	
		for(int i=0;i<count;i++) 
		{
			System.out.println("Enter a number");
			int num = sc.nextInt();
			
			if(n==num) 
			{
				System.out.println("Congratulation! You got a correct number");
				break;
			}
			else if(n>num && count>0)
			{
				System.out.println("Oops! you miss a one chance, Your number is too small try to "
						+ "enter bigger number");
			}
			else if(n<num && count>0)
			{
				System.out.println("Oops! you miss a one chance, Your number is too big try to "
							+ "enter smaller number");
			}	
				
			}
			System.out.println("You have don't have any guess.");
		}
	}
		
	


