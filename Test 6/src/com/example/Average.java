package com.example;

import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0,a,count=0;
		float avg;
		while(num>0)
		{
			a = num%10;
			System.out.print(a+" ");
			num = num/10;
			sum += a;
			count++;
			
		}
		avg = (float)sum/count;
		System.out.println("Average is : "+avg);

	}

}
