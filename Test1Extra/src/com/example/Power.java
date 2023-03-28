package com.example;

import java.util.Scanner;

public class Power 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count =0;
		int n=num;
		while(n > 0)
        {
            n = n / 10;
            count++;
        }
		
			int s = 1;
			for(int i=1;i<=count;i++)
			{
				 s*=num;	
			}
			
			System.out.println(s);
			
		}

	}

