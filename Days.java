// Write a Java program to convert days into years, weeks and days.
import java.util.Scanner;

class Days
 {  
   public static void main (String args[])  
    {      
		Scanner sc = new Scanner(System.in);
		int year, week, day, var;  
			System.out.println("Enter number");
			var=sc.nextInt();

			year = var/365;
			var = var % 365;			

		System.out.println("Number of years = "+year);

			week = var/7;
			var = var % 7;

		System.out.println("Number of Week = "+week);

			day = var;

		System.out.println("Number of days = "+day);
		
    }}  