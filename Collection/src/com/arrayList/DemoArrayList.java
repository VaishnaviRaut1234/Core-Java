package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList 
{

	public static void main(String[] args) 
	{
		List<Integer> list1= new ArrayList<Integer>();
		
		list1.add(81);
		list1.add(67);
		list1.add(76);
		list1.add(54);
		
		for(int i=0; i<list1.size();i++)
		{
			int data = list1.get(i)+5;
			list1.set(i, data);
		}
		for(Integer l:list1)
		{
			System.out.println(l);
		}
	}

}
