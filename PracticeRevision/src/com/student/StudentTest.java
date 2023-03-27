package com.student;

import com.demo.Student;

public class StudentTest {

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.admissionNo=102;
		//s.age=52;	 we cannot access default outside the package
		//s.rollNo=2;  we can not access private member;
		//s.courseId=105;		we cannot access protected outside the package
	}

}
