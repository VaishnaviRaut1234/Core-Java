package com.example;

import java.util.Scanner;

public class CountBinaryStrings 
{
	public static int CountBinaryStrings(int n) 
    { 
        
        int dp[] = new int[n + 1]; 
        
        dp[1] = 2; 
        dp[2] = 3; 
  
        for (int i = 3; i <= n; i++) 
            dp[i] = dp[i - 1] + dp[i - 2]; // initialize the value of 1 and 2 and it goes in loop 
      
        return dp[n]; 
    } 
  
 
    public static void main(String args[]) 
    { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number");
        int n = sc.nextInt(); 
        System.out.println(CountBinaryStrings(n)); 
    } 
}
