package com.demo;

public class TightCouplingDemo 
{
	class Student
	{
		int id;
		String name;
		double fees;
		
		Student()
		{
			
		}
		
		Student(int id, String name)
		{
			this.id=id;
			this.name=name;
			this.fees=0.0;
		}
		
		void calcFees(double fees, int months)
		{
			this.fees=fees*months;
			System.out.println("Fees to be paid is : "+this.fees);
			
		}

		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
		}
		
	}
	
	class CollegeStudent extends Student
	{
		String course;
		
		CollegeStudent()
		{
			
		}

		public CollegeStudent(int id, String name, String course) {
			super(id, name);
			this.course = course;
		}
		void scholarship(double fees,int months,Float sc)
		{
			calcFees(fees,months,sc);
			
		}
		
		public String toString() {
			return  super.toString()+" "+course;
		}
		
	}

	public static void main(String[] args) 
	{

	}

}
