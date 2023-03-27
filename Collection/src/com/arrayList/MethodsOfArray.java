package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsOfArray {

	public static void main(String[] args) 
	{
		ArrayList<String> stud = new ArrayList<>();
		
		stud.add("Vaishnavi");
		stud.add("Shubham");
		stud.add("Ashu");
		stud.add(null);		//null allowed also multiple null allowed
		stud.add("Shubham");	//duplicate allowed
		stud.add("Rahul");
		
		System.out.println(stud);

		stud.add(2,"Rupali");
		System.out.println("********************************");
		System.out.println(stud);
		
		stud.add("Nikhil");
		System.out.println("********************************");
		System.out.println(stud);
		
		ArrayList<String> stud1 = new ArrayList<>();
		
		stud1.add("Pryanka");
		stud1.add("Rupali");
		stud1.add("Priyanka");
		
		System.out.println("********************************");
		System.out.println(stud1);
		
		System.out.println("After adding all");
		stud.addAll(stud1);
		
		System.out.println(stud);
		System.out.println("********************************");
		stud.addAll(2, stud1);
		
		System.out.println(stud);
		System.out.println("********************************");
		stud.removeAll(Collections.singleton("Rahul"));
		System.out.println(stud);
		
		for(int i=0;i<stud.size();i++)
		{
			if(stud.get(i)==("Shubham"))
				{
					stud.remove(i);
				}
		}
		System.out.println(stud);
		
	}

}
