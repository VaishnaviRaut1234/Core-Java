package com.string;

public class ReplaceVowel 
{
	public static void replaceVowel(String st)
	{
		//char ch[]=s.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U'||st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
			{
				st = st.replace(st.charAt(i), '@');
			}
		}
		System.out.println(st);
	}
	
	public static void main(String[] args) 
	{
		String s = "Java is a fun";
		replaceVowel(s);
		
	}

}
