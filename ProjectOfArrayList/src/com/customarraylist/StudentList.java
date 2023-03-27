package com.customarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList 
{
	public static void main(String args[]) 
	{
		ArrayList<Student> slist = new ArrayList<>();
		slist.add(new Student(101,"Vaishu",98f));
		slist.add(new Student(102,"Nikhil",95f));
		slist.add(new Student(103,"Shubham",80f));
		slist.add(new Student(104,"Ashu",91f));
		slist.add(new Student(105,"Ajinkya",74f));
		
		for(Student s:slist)
		{
			System.out.println(s);
		}
		
		Collections.sort(slist);
	}
}
