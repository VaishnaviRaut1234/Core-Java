package com.string;

import java.util.Scanner;

public class Solution 
{
	    public static void main(String []argh)
	    {
	        Scanner sc = new Scanner(System.in);
	        long t=sc.nextLong();

	        for(long i=0;i<t;i++)
	        {
	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=-128 && x<=127)
	                	System.out.println("* byte");
	               if(x>=-32768 && x<=32767)
	            	   System.out.println("* short");
	               if(x>=-2147483648 && x<=2147483647)
	            	   System.out.println("* int");
	               if(x>=-1177580811 && x<=1111775807)
	            	   System.out.println("* long");
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted   anywhere.");
	            }

	        }
	    }
	}
