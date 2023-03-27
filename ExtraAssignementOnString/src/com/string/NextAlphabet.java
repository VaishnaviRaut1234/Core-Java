package com.string;

public class NextAlphabet 
{
	public static void nextChar(String s)
	{
		char ch[] = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				ch[i]=(char) (ch[i]+1);
			}
			System.out.print(ch[i]);
		}
		
	}
	
	public static void main(String[] args) 
	{
		String s = "Java";
		
		nextChar(s);
	}

}
