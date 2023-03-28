package com.example;

import java.util.Scanner;

public class SecondMaxValue 
{
	public static int Max(int a[], int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=1+i;j<total;j++)
			{
				if (a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args)
	{
	
		
		Scanner sc = new Scanner(System.in);
		System.out .println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Second Largest number is : "+Max(a,size));
	}

}
