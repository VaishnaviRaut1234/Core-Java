// Write a Java program to enter length and breadth of a rectangle and find its perimeter.
import java.util.Scanner;

class Perimeter
 {  
   public static void main (String args[])  
    {      
		Scanner sc = new Scanner(System.in);
		int length, breadth, perimeter;  
		System.out.println("Enter length of rectangle");
		length = sc.nextInt();

		System.out.println("Enter breadth of rectangle");
		breadth = sc.nextInt();
                  
                 perimeter= 2*(length+breadth);
            System.out.println("perimeter of rectangle is "+perimeter);  
    }}  
