package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=50;i++)
		{
			num.add(sc.nextInt());
		}
		
		Iterator<Integer> it = num.iterator();
		while(it.hasNext())
		{
			Integer j = it.next();
			if(j%2==0)
			{
				System.out.print(j+" ");
			}
		}
	}

}
