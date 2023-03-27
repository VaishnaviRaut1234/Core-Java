package com.string;

public class RemoveExtraSpace {

	public static void removeSpace(String s)
	{
		char ch[] = s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
			if(count>1)
			{
				ch[i]=ch[i-count];
				break;
			}
			System.out.print(ch[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		String s= "My   name   is vaishu";
		
		removeSpace(s);
	}

}
