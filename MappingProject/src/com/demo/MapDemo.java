package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo 
{
	public static void occuranceMap(ArrayList<String> list)
	{
		HashMap<String, Integer> map = new HashMap<>();
		int count;
		
		for(String s:list)
		{
			count = 1;
			if(map.containsKey(s))
			{
				count = map.get(s);
				map.put(s, count+1);
			}
			else
				map.put(s, count);
		}
		for(Map.Entry<String, Integer> en:map.entrySet())
		{
			System.out.println(en.getKey()+" : "+en.getValue());
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Mango");
		al.add("Kiwi");
		al.add("Orange");
		al.add("Banana");
		al.add("Kiwi");
		al.add("Mango");
		al.add("Mango");
		
		occuranceMap(al);

	}

}
