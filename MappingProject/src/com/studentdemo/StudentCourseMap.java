package com.studentdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentCourseMap 
{
	public static void createCourseStudent(ArrayList<Student> al)
	{
		HashMap<Course, ArrayList<String>> authmap = new HashMap<>();
		
		Iterator<Student> itr = al.iterator();
		ArrayList<String> studentlist;
		
		while(itr.hasNext())
		{
			Student b = itr.next();
			if(!authmap.containsKey(b.getCourse()))
			{
				studentlist = new ArrayList<>();
				
			}
			else
			{
				studentlist = authmap.get(b.getCourse());
				
			}
			studentlist.add(b.getName());
			authmap.put(b.getCourse(), studentlist);
		}
		
		for(Map.Entry<Course, ArrayList<String>> en:authmap.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println("Student List :");
			studentlist = en.getValue();
			for(String s:studentlist)
			{
				System.out.println(s+" ,");
			}
			System.out.println();
			System.out.println("====================");
		}
	}

	
	public static void main(String[] args) 
	{
		
		ArrayList<Student> bal = new ArrayList<>();
		
		bal.add(new Student("Harry potter",1001, 56, new Course("J.K.Rowling",1,567f)));
		bal.add(new Student("The christams pig",1002, 87, new Course("J.K.Rowling",1,67000f)));
		bal.add(new Student("Fantastic beasts",1003,94, new Course("J.K.Rowling",1,67000f)));
		
		bal.add(new Student("The clear blue sky",1004,45, new Course("Narayan Murthy",2,67000f)));
		bal.add(new Student("The better india a bettwe word",1005, 12, new Course("Narayan Murthy",2,67000f)));
		
		bal.add(new Student("othello",1006, 45,new Course("willam shekspier",3,67000f)));
		bal.add(new Student("The clear blue sky",1004,73, new Course("Narayan Murthy",2,67000f)));
		
		
		
		
		createCourseStudent(bal);
		
		
	}
}
