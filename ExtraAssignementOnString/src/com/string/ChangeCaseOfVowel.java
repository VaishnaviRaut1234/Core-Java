package com.string;

public class ChangeCaseOfVowel 
{
	public static void changeVowel(String s)
	{
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
	            ch[i] = (char) ((int) ch[i] + 32);
			}
			else if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i] = (char) ((int) ch[i] - 32);
			}
			
			System.out.print(ch[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		String s = "vaishnavi";
		changeVowel(s);
	}

}
