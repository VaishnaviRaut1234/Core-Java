package com.string;

public class FrequencyOfChar 
{
	public static void frequency(String s)
	{
		char ch[] = s.toCharArray();
		int[] freq = new int[ch.length];  
		for(int i=0;i<ch.length;i++)
		{
			freq[i] = 1;  
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					freq[i]++; 
					ch[j]='0';
				}
			}
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='0')
				System.out.println(ch[i]+" "+freq[i]);
		}
	}
			
	public static void main(String[] args) 
	{
		String s = "my name is vaishu";
		frequency(s);
	}

}
