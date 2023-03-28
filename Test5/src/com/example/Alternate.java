package com.example;

import java.util.Scanner;

public class Alternate {

	static void alternateMerge(int arr1[], int arr2[],
            int n1, int n2, int arr3[])
{
		int i = 0, j = 0, k = 0;


while (i < n1 && j < n2) 
{
	arr3[k++] = arr1[i++];
	arr3[k++] = arr2[j++];
}


while (i < n1)
	arr3[k++] = arr1[i++];


while (j < n2)
	arr3[k++] = arr2[j++];
}


public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	
	int arr1[]= new int[size];
	int arr2[]= new int[size];
	int n1 = arr1.length;
	int n2 = arr2.length;
	System.out.println("Enter the elements of first array");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=sc.nextInt();
	}
	System.out.println("Enter the elements of second array");
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]=sc.nextInt();
	}

	int arr3[] = new int[n1 + n2];
	alternateMerge(arr1, arr2, n1, n2, arr3);

	System.out.println("Array after merging");
	for (int i = 0; i < n1 + n2; i++)
		System.out.print(arr3[i] + " ");
}
}
