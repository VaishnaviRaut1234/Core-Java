//  Write a Java program to enter marks of five subjects and calculate total, average and percentage.

import java.util.Scanner;

class Student
 {  
   public static void main (String args[])  
    {      
		Scanner sc = new Scanner(System.in);
		double sub1, sub2, sub3, sub4, sub5 , total;  
		System.out.println("Enter sub1 marks");
		sub1 = sc.nextDouble();

		System.out.println("Enter sub2 marks");
		sub2 = sc.nextDouble();

		System.out.println("Enter sub3 marks");
		sub3 = sc.nextDouble();

		System.out.println("Enter sub4 marks");
		sub4 = sc.nextDouble();

		System.out.println("Enter sub5 marks");
		sub5 = sc.nextDouble();

		double avg, percentage;
			

			total = sub1+sub2+sub3+sub4+sub5;
			
			avg = total / 5;

			percentage = (total / 500) * 100;	

		System.out.println("Total marks of student= "+total);
		System.out.println("Average marks of student= "+avg);
		System.out.println("Percentage of student= "+percentage);
		
    }}  