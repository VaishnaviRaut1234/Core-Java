package com.institute;

import java.util.Scanner;

public class ComputerInstitute {

	static Scanner sc = new Scanner(System.in);
	
	public static void enterInstituteDetails(Institute it)
	{
		System.out.println("Enter registration id");
		it.setRegId(sc.nextInt());
		
		System.out.println("Enter name of institute");
		it.setName(sc.next());
		
		System.out.println("Enter Number of course");
		it.setNoOfCourse(sc.nextInt());
		
		for(int i=0;i<it.getNoOfCourse();i++)
		{
			System.out.println("Enter course"+(i+1)+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Institute myinstitute = new Institute();
		
		
	}

}
