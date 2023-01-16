//  Write a Java program to enter P, T, R and calculate Simple Interest.

import java.util.Scanner;

class Interest
 {  
   public static void main (String args[])  
    {      
		Scanner sc = new Scanner(System.in);
		int P, R, T, Interest; 
		
		System.out.println("Enter Principal Amout");
		P = sc.nextInt();

 
		System.out.println("Enter Rate");
		R = sc.nextInt();

		System.out.println("Enter Time");
		T = sc.nextInt();

			
			Interest = (P*R*T)/100;

		System.out.println("Simple Interest = "+Interest);
		
    }}  