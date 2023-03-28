package com.demo;

import java.util.ArrayList;
import java.util.List;

public class StudentCourseArrayList 
{
	
	public static void main(String[] args) 
	{
		 List<Student> stud = new ArrayList<Student>();
		 Student s1 = new Student("Vaishu",101,45f, new Course("Java",1,5670));
		 Student s2 = new Student("Rahul",102,35f, new Course("C++",1,5000));
		 stud.add(s1);
		 stud.add(s2);
		 System.out.println(stud);
		
		 
	}

}
