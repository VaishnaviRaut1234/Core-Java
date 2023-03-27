package com.test;

import java.util.Scanner;

public class HeadsTails {
    public static int minCoinsReversed(int[] num) {
       /* int count = 0;
        int current = coins[0];
        for (int i = 1; i < coins.length; ++i) {
            if (coins[i] == current) {
                count++;
            }
            current = coins[i];
        }
        return count;*/
    	int changesWithLeading0 = 0;
    	  int changesWithLeading1 = 0;
    	  for (int i = 0; i < num.length; i++) {
    	    if (num[i] == 1 - (i % 2)) {
    	      changesWithLeading0 ++;
    	    }
    	    if (num[i] == i % 2) {
    	      changesWithLeading1 ++;
    	    }
    	  }
    	  return Math.min(changesWithLeading0, changesWithLeading1);
    	}
    
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size");
    	int s = sc.nextInt();
    	
    	int myarr[] = new int[s];
    	
    	System.out.println("Enter an element");
    	for(int i=0;i<s;i++)
		{
			myarr[i]=sc.nextInt();
		}
      
        System.out.println(minCoinsReversed(myarr));
    }
}
