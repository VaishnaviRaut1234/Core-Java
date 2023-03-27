package com.string;

public class CountWord 
{

	public static void main(String[] args) 
	{
		String s = "My name is vaishu";
		
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

}
