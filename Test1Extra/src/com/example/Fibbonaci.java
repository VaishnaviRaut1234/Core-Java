//show Fibbonaci Series

package com.example;

public class Fibbonaci 
{

	public static void main(String[] args) 
	{
		
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=10000;i++)
		{
			
			n3=n1+n2;
			n1=n2;
			if(n3%5==0)
			{
				continue;	
				
			}
			n2=n3;
			
			System.out.print(" "+n3);
			
			
		}
	}

}
