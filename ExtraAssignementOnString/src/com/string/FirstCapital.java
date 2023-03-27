package com.string;

public class FirstCapital 
{
	public static void capital(String s)
	{
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[0]=(char) (ch[0]-32);
			if(ch[i]==' ')
			{
				i++;
				System.out.print(" ");
				//ch[i]=ch[i+1];
				ch[i]=(char) (ch[i]-32);
			}
			System.out.print(ch[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		String s = "i love my india";
		
		capital(s);
	}

}
