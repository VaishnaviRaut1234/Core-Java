package com.string;

public class DuplicateWord 
{
	public static void duplicate(String s)
	{
		
		s=s.toLowerCase();
		int count;
		String ch[]=s.split(" ");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i].equals("visited"))
				continue;
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i].equals(ch[j])) 
				{
					count++;
					ch[j]="visited";
				}
				
			}
			if(count>1)
			{
				System.out.println(ch[i]+" "+count);
			}
		}
	}
	public static void main(String[] args) 
	{
		String s = "java is very good language java language is used for program program is for coding";
		
		duplicate(s);
	}

}
