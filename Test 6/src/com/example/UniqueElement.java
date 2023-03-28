package com.example;

public class UniqueElement 
{
	public static void uniqueWord(String s1[], String s2[] )
	{
		boolean flag;
		for(int i=0;i<s2.length;i++)
		{
			flag = false;
			for(int j=0;j<s1.length;j++) 
			{
				if(s2[i].equals(s1[j]))
				{
					flag=true;
				}
			}
			if(flag)
			{
				System.out.print(s2[i]+", ");
			}
		}
	}

	public static void main(String[] args) 
	{
		String str1[]={"Java", "C","Python","Oracle"};

		String str2[]={"Angular","SpringBoot","Java","SQL","Oracle"};
		
		
		uniqueWord(str1 , str2);
	}
}