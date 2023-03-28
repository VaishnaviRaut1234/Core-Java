package com.example;

import java.util.Scanner;

public class Reverse 
{
	 /*static void rvereseArray(int arr[],
             int start, int end)
{
 int temp;
   
 while (start < end)
 {
     temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;
     start++;
     end--;
 }
}    

/* Utility that prints out an
array on a line */
/*static void printArray(int arr[],
                     int size)
{
 for (int i = 0; i < size; i++)
      System.out.print(arr[i] + " ");
   
  System.out.println();
}*/
	public static void main(String[] args) 
	{
		 //int arr[] = {1, 2, 3, 4, 5, 6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
	    int i,j;
		int arr[]= new int[size];
		
		System.out.println("Enter the elements of array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size/2;i++)
		{
			
		}
		
		 for(i=(size/2);i<size-1;i++)
	      {
	        
	      }

	   System.out.println("The Output Is:");
	   for(i=0;i<size;i++)
	     {
	        System.out.println(" "+arr[i]);
	     }


	}

}
