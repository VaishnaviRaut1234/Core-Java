// Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit
import java.util.Scanner;

class Temperature
 {  
   public static void main (String args[])  
    {      
		Scanner sc = new Scanner(System.in);
		  
		System.out.println("Enter temperature in Celsius");
			double Celsius, Fahrenheit;
			
			Celsius = sc.nextDouble();
			Fahrenheit = (Celsius * 1.8) + 32;

		System.out.println("Tempreature in Fahrenheit "+Fahrenheit);
		
    }}  