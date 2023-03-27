package com.arraylogical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSearch 
{
	public static void countFrquency(List<String> list1)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a colour");
		String a = sc.next();
		 
		    if (a.contains("Red")) {
		    System.out.println("Found the element");
		    } 
		    else 
		    {
		    System.out.println("There is no such element");
		    }
	}
	public static void main(String[] args) 
	{
		//ArrayList<String>
		List<String> list1 = new ArrayList<String>();
		  list1.add("Red");
		  list1.add("Green");
		  list1.add("Orange");
		  list1.add("White");
		  list1.add("Black");
		  System.out.println(list1);
		  
		  countFrquency(list1);
	}

}
