package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class SupplierTest 
{
	public static void createMappingdemo(ArrayList<Supplier> sup)
	{
		HashMap<Integer , ArrayList<Supplier>> mp = new HashMap<>();
		for(Supplier id:sup)
		{
			int sid = id.getRegNo();
			if(!mp.containsKey(mp))
			{
				mp.put(sid,id.getRegNo());
			}
		}
		for(Entry<Integer, ArrayList<Supplier>> en : mp.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println("==================================");
			for(Supplier s: en.getValue())
            {
          	  System.out.println(s);
            }
             System.out.println("=============================================");
		}
		
	}
	public static void main(String[] args)
	{
		ArrayList<Item> itm1 = new ArrayList<>();
		itm1.add(new Item(1,"Laptop"));
		itm1.add(new Item(2,"Desktop"));
		itm1.add(new Item(3, "Mouse"));
		itm1.add(new Item(4, "Keyboard"));
		
		ArrayList<Item> itm2 = new ArrayList<>();
		itm2.add(new Item(1,"Mobile"));
		itm2.add(new Item(2,"Earphone"));
		itm2.add(new Item(3, "Charger"));
		itm2.add(new Item(4, "Mobile Cover"));
		
		ArrayList<Item> itm3 = new ArrayList<>();
		itm3.add(new Item(1,"TV"));
		itm3.add(new Item(2,"AC"));
		itm3.add(new Item(3, "Refregirator"));
		itm3.add(new Item(4, "WashingMashine"));
		
		ArrayList<Supplier> s = new ArrayList<>();
		
		s.add(new Supplier(1, "Vaishnavi",itm1));
		s.add(new Supplier(2, "Ashwini",itm2));
		s.add(new Supplier(3, "Priyanka",itm3));
	}
}
