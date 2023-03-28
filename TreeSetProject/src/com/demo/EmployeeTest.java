package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeTest {

	public static void createAuthorNumberBookMap(ArrayList<Employee> al)
	{
		HashMap<Employee, Department> authmap= new HashMap<>();
		
		Iterator<Employee> itr= al.iterator();
		int count;		
		while(itr.hasNext())
		{
			count=1;
			Employee b= itr.next();
			if(!authmap.containsKey(b.getDep()))
			{				
				authmap.put(b.getDep(), count);
			}
			else
			{
				count= authmap.get(b.getDep());
				authmap.put(b.getDep(), count+1);
			}
		}
	}
	public static void main(String[] args) 
	{
		
			
			
		
		
	}

}
