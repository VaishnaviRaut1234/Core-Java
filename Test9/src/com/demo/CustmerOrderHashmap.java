package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class CustmerOrderHashmap 
{
	public static void sorting(ArrayList<Cutomer> list)
	{
		HashMap<Order, Integer> authmap= new HashMap<>();
		Iterator<Cutomer> itr= list.iterator();
		int count;
		while(itr.hasNext())
		{
			count=1;
			Cutomer b= itr.next();
			if(!authmap.containsKey(b.getOrder()))
			{				
				authmap.put(b.getOrder(), count);
			}
			else
			{
				count= authmap.get(b.getOrder());
				authmap.put(b.getOrder(), count+1);
			}
			
			
		}
		System.out.println(list);
		 
		
	}
	public static void main(String[] args) 
	{
		
		ArrayList<Cutomer> bal = new ArrayList<>();
		
		bal.add(new Cutomer(1001, "Vaishu", new Order(1,5,2300f)));
		bal.add(new Cutomer(1002, "Rahul", new Order(2,3,890f)));
		bal.add(new Cutomer(1003, "Shubham", new Order(3,3,2400f)));
		
		sorting(bal);
	}
}
