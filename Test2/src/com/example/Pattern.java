package com.example;

import java.util.Scanner;

public class Pattern 
{

	public static void main(String[] args) 
	{
		int i,j,k;
		k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				if(k%2==1)
				{
					System.out.print("1");
				}
				else
				{
				System.out.print("0");
				}
				k++;
			}
			
			System.out.println();
			
		}
	}

}
