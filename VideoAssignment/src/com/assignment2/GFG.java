package com.assignment2;

import java.util.Scanner;

class Digit
{
	
	//static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number");
    	int n= sc.nextInt();
    	boolean isPresent=false;
    	
        while (n != 0) 
        {
        	if(n%10==3)
        	{
        		isPresent=true;
        		break;
        	}
        	n=n/10;
        }
        System.out.println(isPresent);
    	
    	
    }
}
