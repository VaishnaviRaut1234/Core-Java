package com.string;

public class UniqueCharacter
{
	public static void uniqueElement(String s)
	{
			
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            if (ch[i] == ch[j])
                break;
     
             if (i == j && ch[i] != ' ')
            System.out.print( ch[i] + ", ");       
        }
	}
		public static void main(String[] args) 
		{
			String s = "My name is vaishnavi";
			uniqueElement(s);
		}
}