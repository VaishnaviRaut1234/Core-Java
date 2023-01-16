//Write a Java program to enter two numbers and find their sum.
import java.util.Scanner;

class Sum
 {  
   public static void main (String args[])  
    {      
		Scanner sc = new Scanner(System.in);
		int num1, num2, sum;  
		System.out.println("Enter First number");
		num1 = sc.nextInt();

		System.out.println("Enter second number");
		num2 = sc.nextInt();
                  
                 sum= num1+num2;
            System.out.println("Sum of Two number is "+sum);  
    }}  