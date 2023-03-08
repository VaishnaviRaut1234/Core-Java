package com.revise;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.display();

		System.out.println("--------------------");
		Student s2 = new Student(102 , "Ashu");
		s2.display();
		
		System.out.println("-------------------");
		Student s3 = new Student(103, "Vaishu", 89);
		s3.display();
		
		System.out.println("------------------------");
		Student s4 = new Student(104, "Rahul",85,"SGBAU");
		s4.display();
	}

}
