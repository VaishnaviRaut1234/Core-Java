package com.example;

public class SortingString 
{

	public static void main(String[] args) 
	{
		String arr[] = {"red", "blue", "black","green"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].charAt(0)>arr[j].charAt(0))
				{
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(String s : arr)
		{
			System.out.println(s);
		}
	}

}
