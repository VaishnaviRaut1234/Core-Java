// Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C).
import java.util.Scanner;

class Tempe
 {  
   public static void main (String args[])  
    {   
		Scanner sc = new Scanner(System.in);
		double Celsius, Fahrenheit;
		System.out.println("Enter temperature in Fahrenheit");
		Fahrenheit = sc.nextDouble();  
			
			Celsius  = ((Fahrenheit-32)*5)/9;

		System.out.println("Tempreature in Celsius "+Celsius);
		
    }}  