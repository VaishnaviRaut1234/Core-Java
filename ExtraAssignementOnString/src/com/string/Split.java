package com.string;

public class Split {

	public static void splitStringWithputFunction(String st)
	{
		String words="";
		
		String splitstr[] = new String[20];
		
		int temp=0;
		st=st+' ';
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)!=' ')
			{
				words = words+st.charAt(i);
			}
			else
			{
				splitstr[temp]=words;
				temp++;
				words="";
			}
		}
		for(int i=0;i<temp;i++)
		{
			System.out.println(splitstr[i]);
		}
	}
	public static void main(String[] args) {
		String s = "What is the length";
		
		splitStringWithputFunction(s);
	}

}
