//  Write a Java program to enter marks of five subjects and calculate total, average and percentage.


class Student
 {  
   public static void main (String args[])  
    {      
		int sub1, sub2, sub3, sub4, sub5 , total;  
		float avg, percentage;
			sub1 = 86;
			sub2 = 98;
			sub3 = 45;
			sub4 = 65;
			sub5 = 72;

			total = sub1+sub2+sub3+sub4+sub5;
			percentage = (total / 500) * 100;	
			avg = total / 5;

		System.out.println("Total marks of student= "+total);
		System.out.println("Average marks of student= "+avg);
		System.out.println("Percentage of student= "+percentage);
		
    }}  