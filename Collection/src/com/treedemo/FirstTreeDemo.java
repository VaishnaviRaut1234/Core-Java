package com.treedemo;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class FirstTreeDemo {

	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> map1 = new TreeMap<>();
		
		map1.put(7, "C");
		map1.put(6, "Python");
		map1.put(5, "Java");
		map1.put(8, null);
		
		for(Map.Entry<Integer, String> en: map1.entrySet())
		{
			System.out.println(en.getKey()+"  "+en.getValue());
		}
		
	
		
		System.out.println("First key:"+map1.firstKey());
		System.out.println("Last Key:"+map1.lastKey());
			
		
		
		System.out.println(map1.keySet());
		
		
		System.out.println("Lower Key:"+map1.lowerKey(7)); 
		System.out.println("Floor Key:"+map1.floorKey(7));
		
		
		System.out.println("Higher Key:"+map1.higherKey(7));
        System.out.println("Ceiling key:"+map1.ceilingKey(7));
        
        SortedMap<Integer, String> sm5=   map1.headMap(6); 
		System.out.println(sm5);
        
        SortedMap<Integer, String> nm1=   map1.headMap(6, true);
     	System.out.println(nm1);
        
    	SortedMap<Integer, String> sm1=   map1.tailMap(6); 
		System.out.println(sm1);
		
		SortedMap<Integer, String> nm2=   map1.tailMap(6,false); 
		System.out.println(nm2);
		
		SortedMap<Integer, String> sm2=  map1.subMap(2, 6); 
		System.out.println(sm2);
		
		SortedMap<Integer, String>  nm3=  map1.subMap(2,true, 6,true); 
		System.out.println(nm3);
	}

}
