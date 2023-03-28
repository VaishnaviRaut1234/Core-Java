package com.example;

import java.util.Scanner;

public class Frequency 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count =  0;
		int digit;
		
		for(int i=0;i<num;i++)
        {
            count=0;
            int temp=num;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+" "+count);
            }
        }

	}

}
