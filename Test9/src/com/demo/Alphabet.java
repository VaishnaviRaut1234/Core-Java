package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alphabet 
{
	public static void countFrequencies(List<String> list)
    {
      
        Map<String, Integer> hm = new HashMap<String, Integer>();
 
        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
 
       
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.print("("+val.getKey()+"," + val.getValue()+"),");
        }
    }
	
	public static void main(String[] args) 
	{
		 List<String> list = new ArrayList<String>();
		 list.add("a");
		 list.add("b");
		 list.add("a");
		 list.add("c");
		 list.add("a");
		 list.add("c");
		 list.add("d");
		 System.out.println(list);
		 
		 countFrequencies(list);
		 
	}
	
}
