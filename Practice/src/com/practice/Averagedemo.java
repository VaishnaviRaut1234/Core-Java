package com.practice;

import java.util.Scanner;

public class Averagedemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String no = sc.next();
		float avg=0.0f;
		int count =0;
		
		while(!no.equals("q"))
		{
			avg +=Float.parseFloat(no);
			count++;
			no=sc.next();
		}
		System.out.println(avg/count);
	}

}
