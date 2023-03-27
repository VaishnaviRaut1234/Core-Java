package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Stud
{
	int id;
	String name;
	int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Stud() {
		super();
		
	}
	public Stud(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object o)
	{
		if(this==0)
		{
			
		}
	}
	
}
public class Student 
{
	public static void searchStudent(HashMap<Student, String> map)
	{
		String name="Vaishu";
		Student s = null;
		String course = null;
		for(Map.Entry<Student, String> en:map.entrySet())
		{
			s = en.getKey();
			if(s.getName().equals(name))
			{
				course = en.getValue();
			}
		}
		if(course!=null)
		{
			System.out.println(name+" has applied for "+course);
		}
		else
		{
			System.out.println("No record Found");
		}
	}
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		
	}
}
