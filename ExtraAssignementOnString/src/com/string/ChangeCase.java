package com.string;

import java.util.Scanner;

public class ChangeCase 
{
	public static void caseChange(String s)
	{
		char ch[] = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i] >= 'a' && ch[i] <= 'z') 
			{
                ch[i] = (char) ((int) ch[i] - 32);
			}
			else if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				ch[i] = (char) ((int) ch[i] + 32);
			}
			System.out.print(ch[i]);
        }
		
	}
	
	public static void main(String[] args) 
	{
		//String s = "JaVA";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s = sc.next();
		caseChange(s);
		
	}

}
