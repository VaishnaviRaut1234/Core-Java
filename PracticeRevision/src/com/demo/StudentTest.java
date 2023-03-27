package com.demo;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.admissionNo=102;
		s.age=52;
		//s.rollNo=2;  we can not access private member;
		s.courseId=105;
	}

}
