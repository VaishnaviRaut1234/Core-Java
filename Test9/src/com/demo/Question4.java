package com.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Question4 
{
		public static void main(String[] args) {
			ArrayList<String> vaishuCourse = new ArrayList<>();
			vaishuCourse.add("Java");
			vaishuCourse.add("Python");
			
			ArrayList<String> ShubahmCourse = new ArrayList<>();
			ShubahmCourse.add("Java");
			ShubahmCourse.add("CSHARP");
			ShubahmCourse.add("Python");
			
			ArrayList<String> ashuCourse = new ArrayList<>();
			ashuCourse.add("Cyber Security");
			ashuCourse.add("CSHARP");
			ashuCourse.add("Python");
			
			HashMap<String, ArrayList<String>> StudentCourse = new HashMap<>();
			StudentCourse.put("Ashu", ashuCourse);
			StudentCourse.put("Vaishu", vaishuCourse);
			StudentCourse.put("shubham", ShubahmCourse);

			System.out.println("Ashu enrolled for the Course : " + StudentCourse.get("Ashu"));
			System.out.println("Vaishu enrolled for the Course : " + StudentCourse.get("Vaishu"));
			System.out.println("Shubham enrolled for the Course : " + StudentCourse.get("shubham"));
		}

	
}
