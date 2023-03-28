package com.example;

import java.util.Scanner;

public class MinimumOfArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int min = a[0];			//consider your zeroth position value is min.
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum value is : "+min);
		
	}

}
