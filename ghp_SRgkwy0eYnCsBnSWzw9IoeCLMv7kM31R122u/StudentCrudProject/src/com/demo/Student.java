package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Student  implements Operation 
{
	Scanner sc = new Scanner(System.in);
	boolean flag1 = false;
	int count = 0;
	int id = 0;
	int flag = 0;
	
	
	ArrayList<StudentDetails> al = new ArrayList<>();
	ArrayList<Course> a1 = new ArrayList<>();
	StudentDetails b = null;
	Course a = null;
	
	@Override
	public boolean insert() 
	{
		System.out.println("1.Add Student");
		System.out.println("Enter Student's  Id...");
		int id = sc.nextInt();
		System.out.println("Enter Student's Name...");
		String name = sc.next();
		System.out.println("Enter Student's Age...");
		int age = sc.nextInt();
		
		b = new StudentDetails(id, name, age);
		
		count++;
		al.add(b);
		flag1 = true;

		return flag1;
	}
	
	@Override
	public boolean insertc() 
	{
		System.out.println("1.Add Course");
		System.out.println("Enter Course  Id...");
		int cid = sc.nextInt();
		System.out.println("Enter Course Name...");
		String cname = sc.next();
		System.out.println("Enter Course fees...");
		float fees = sc.nextInt();
		a = new Course(cid,cname,fees);
		count++;
		a1.add(a);
		flag1 = true;

		return flag1;
	}

	
	@Override
	public boolean update() {
		System.out.println("2.Update Student:");
		System.out.println("Enter the student id for Update:");
		int studentid = sc.nextInt();
	
		if ((b != null && b.getSId() == studentid)) 
		{
			System.out.println("Enter the Student name for Update:");
			String name = sc.next();

			b.setName(name);
			System.out.println("Enter the Student age for Update:");
			int age = sc.nextInt();
			b.setAge(age);
		}

		al.add(b);
		flag1 = true;

		return flag1;
	}
	
	@Override
	public boolean updatec() {
		System.out.println("2.Update Course:");
		System.out.println("Enter the Course id for Update:");
		int courseid = sc.nextInt();
		if (a != null && a.getCid() == courseid) 
		{
			System.out.println("Enter the Course fees for Update:");
			int fees = sc.nextInt();
			a.setFees(fees);
		}

		a1.add(a);
		flag1 = true;

		return flag1;
	}
	

	@Override
	public boolean delete() {
		System.out.println("3.Delete the Student:");
		System.out.println("Enter the student id for Delete:");
		id = sc.nextInt();
		if (b != null && b.getSId() == id) {
			b = null;
		}
		al.add(b);
		flag1 = true;
		return flag1;
	}
	
	@Override
	public boolean deletec() {
		System.out.println("3.Delete the Course:");
		System.out.println("Enter the Course id for Delete:");
		id = sc.nextInt();
		if (a != null && a.getCid() == id) {
			a = null;
		}
		a1.add(a);
		flag1 = true;
		return flag1;
	}

	@Override
	public boolean search() 
	{
		System.out.println("4.Searching the Student:");
		System.out.println("Enter the student Id for search :");
		id = sc.nextInt();
	
		if (b != null && b.getSId() == id ) 
		{
			flag = 1;
		}
		
		if (flag == 1) 
		{
			System.out.println(b);
		}
		
		al.add(b);
		flag1 = true;
		return flag1;
	}
	
	@Override
	public boolean searchc() {
		System.out.println("4.Searching the Course:");
		System.out.println("Enter the course Id for search :");
		id = sc.nextInt();
		if (a != null && a.getCid() == id) {
			flag = 1;
		}
		if (flag == 1) {
			System.out.println(a);
		}
		a1.add(a);
		flag1 = true;
		return flag1;
	}
	

	@Override
	public void show_details() {
		
		
			System.out.println("All Information Student:");
			if(b!=null)
			{
			System.out.println(b);
			
			}
			

	}
	
	@Override
	public void show_detailsc() {
		
		if (a != null) 
		{
			System.out.println("All Information Course:");
			System.out.println(a);
		}
		else
		{
			System.out.println("Course is not available");
		}

	}

	@Override
	public void exit() {
		System.exit(0);

	}

	
}
