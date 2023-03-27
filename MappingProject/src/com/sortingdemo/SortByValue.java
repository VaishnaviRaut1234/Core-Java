package com.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortByValue {
	public static void sortValue(HashMap<Integer,String> map)
	{
		ArrayList<String> al = new ArrayList<>(map.values());
		
		//System.out.println(al);
		Collections.sort(al);
	//	System.out.println(al);
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		
		int k;
		for(String s:al)
		{
			for(Map.Entry<Integer,String> en:map.entrySet())
			{
				if(en.getValue().equals(s))
				{
					k = en.getKey();
					if(!lhm.containsKey(k))
					{
						lhm.put(k, s);
					}
				}
			}
		}
		System.out.println(lhm);
	}

	public static void main(String[] args) 
	{
		HashMap<Integer, String> ba = new HashMap<>();
		ba.put(1, "Java");
		ba.put(7, "c");
		ba.put(5, "Angular");
		ba.put(8, "HTML");
		
		sortValue(ba);
	}

}
