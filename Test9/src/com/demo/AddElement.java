package com.demo;

import java.util.Scanner;

public class AddElement 
{
	public static void main(String[] args) 
	{
		int digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		int i;
		int sum = 0;
		System.out.println("Enter the elements of array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		for(i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		int temp=sum;  
		while(sum>0)  
		{  
		sum=sum/10;  
		}  
		int result =0;
		
		while(temp > 0 || result>10)
		{
			digit=temp%10;  
			temp=temp/10;  
			result+= digit;
		}
		
		System.out.println(result);
	}
}
