package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map1 = new HashMap<>();
		
		map1.put(1,"Java");
		map1.put(2,"Java");
		map1.put(3,"CSS");
		map1.put(4,"XML");
		map1.put(5,"C++");
		
		Set<Entry<Integer, String>> entrySet = map1.entrySet();
		
		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> entry =itr.next();
			//System.out.println(entry.getKey()+" "+entry.getValue());
			
			if(entry.getValue()=="Java")
			{
				entry.setValue("Core Java");
			}
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
			
		
	}
}
