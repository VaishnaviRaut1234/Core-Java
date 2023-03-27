package com.example;

import java.util.Scanner;

public class SumSuccessiveElement 
{
	  public static int SumSuccessiveElements(int arr[], int size, int n)
      {
          int sum = 0;
          for(int i=(n-1); i<size; i=i+n)
          {
        	  
        		 sum += arr[i];
          }
          return sum;    
                   
      }

      public static void main(String[] args) 
      {
    	Scanner sc = new Scanner(System.in);
  		System.out.println("Enter the size of array");
  		int size = sc.nextInt();
  		
  		int arr[]= new int[size];
  		System.out.println("Enter the elements of array");
  		for(int i=0;i<arr.length;i++)
  		{
  			arr[i]=sc.nextInt();
  		}
  		System.out.println("Enter a number for Sum Successive Elements");
  		int n = sc.nextInt();
    
          
          System.out.println("Sum of successive elements is "+SumSuccessiveElements(arr,size,n));
      }
}
