package com.linkedhashmapdemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DemoLinkedHashMap 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<String, Double> lmap = new LinkedHashMap<>();
		
		lmap.put("Rupali", 78.5);
		lmap.put("Vaishu", 70.5);
		lmap.put("Rahul", 7.5);
		lmap.put("Vivek", 45.5);
		lmap.put("Uday", 83.7);
		
		for(Map.Entry<String, Double> en: lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		Set<String> name = lmap.keySet(); 
		Iterator<String> itr = name.iterator();
		while(itr.hasNext())
		{
			String k = itr.next();
			System.out.println(k+" "+lmap.get(k));
		}
		
		Collection<Double> marks  = lmap.values();
		Iterator<Double> itr1 = marks.iterator();
		while(itr1.hasNext())
		{
			
			System.out.println(itr1.next());
		}
		System.out.println();
	}

}
