package com.demo;
import java.util.Scanner;

public class StudentMain 
{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			int choice;
			Operation o = new Student();
			do 
			{
				System.out.println("1.Add Student");
				System.out.println("2.Update Student");
				System.out.println("3.Delete Student");
				System.out.println("4.Search Student");
				System.out.println("5.Add course");
				System.out.println("6.Update Couse");
				System.out.println("7.Delete Course");
				System.out.println("8.Search Course");
				System.out.println("9.Student Details ");
				System.out.println("10.Course Details");
				System.out.println("11. Exit");
				System.out.println("Enter the choice");
				choice = sc.nextInt();
				
				
				
				
				
				switch (choice) 
				{
				case 1:
					boolean bol = o.insert();
					if (bol == true) 
					{
						System.out.println("Student Inserted Succesfully");
					}

					break;
				case 2:
					boolean bol1 = o.update();
					if (bol1 == true) 
					{
						System.out.println("Student Updated Succesfully");
					}
					break;
				case 3:
					boolean bol2 = o.delete();
					if (bol2 == true) 
					{
						System.out.println("Student Deleted Succesfully");
					}
					break;
				case 4:
					boolean bol3 = o.search();
					if (bol3 == true) 
					{
						System.out.println("Student is available");
					}
					else
					{
						System.out.println("Student is not avialable");
					}
					break;

				case 5:
						boolean bol4 = o.insertc();
						if (bol4 == true) 
						{
							System.out.println("Course Inserted Succesfully");
						}

						break;
				
				case 6 :
						boolean bol5 = o.updatec();
						if (bol5 == true) 
						{
							System.out.println("Course Updated Succesfully");
						}
						break;
						
				case 7 : 
						boolean bol6 = o.deletec();
						if (bol6 == true) 
						{
							System.out.println("Course Deleted Succesfully");
						}
						break;
				case 8 : 
						boolean bol7 = o.searchc();
						if (bol7 == true) 
						{
							System.out.println("Course is available");
						}
						else
						{
							System.out.println("Course is not avialable");
						}
						break;

				case 9 : 
						o.show_details();
					break;
					
				case 10 : 
							o.show_detailsc();
							break;
				default:
					System.out.println("Exit ");
					System.out.println("Thank you for visiting us..!!");
					return;
				}
				
				
				System.out.println();

			} 
			while (choice != 11);

		}

	
}
