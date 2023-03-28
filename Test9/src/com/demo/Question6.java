package com.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Question6 
{
		public static void main(String[] args) {
			ArrayList<String> java = new ArrayList<>();
			java.add("Ashwini");
			java.add("Shubham");
			
			ArrayList<String> python = new ArrayList<>();
			python.add("Nikhil");
			python.add("Ajinkya");
			python.add("Vaishnavi");
			
			ArrayList<String> DotNet = new ArrayList<>();
			DotNet.add("Priyanka");
			DotNet.add("Rupali");
			DotNet.add("Suraj");
			
			HashMap<String, ArrayList<String>> course = new HashMap<>();
			course.put("java", java);
			course.put("python", python);
			course.put("DotNet", DotNet);

			System.out.println("Student enrolled for java  : " + course.get("java"));
			System.out.println("Student enrolled for python  : " + course.get("python"));
			System.out.println("Student enrolled for DotNet  : " + course.get("DotNet"));
			
		}

	
}
