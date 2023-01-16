// WAP to calculate BMI.

import java.util.Scanner;

class Bmi
 {  
   public static void main (String args[])  
    {      
		Scanner sc = new Scanner(System.in);
		
		double height, weight, BMI; 
		System.out.println("Enter Height");
		height = sc.nextDouble();
		
		System.out.println("Enter Weight");
		weight = sc.nextDouble();
		
		height = 0.3048 * height;

		BMI = weight / (height * height);
            System.out.println("The BMI is "+BMI); 
    }}  