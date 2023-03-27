package com.string;

public class CountLines 
{
	public static void countWord(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' '|| ch[i]=='\0')
			{
				count++;
			}
		}
		System.out.println("Number of words are : "+(count+1));
	}
	
	public static void countChar(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!= ' ')
			{
				count++;
			}
    	}
		System.out.println("Length of the string : "+count);
	}
	
	
	
	public static void main(String[] args) 
	{
		String s = "My name is vaishnavi";
		
		countWord(s);
		countChar(s);
	}

}
