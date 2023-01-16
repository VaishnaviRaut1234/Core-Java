// Write a Java program to enter length in centimeter and convert it into meter and kilometer.
import java.util.Scanner;

class Length
 {  
   public static void main (String args[])  
    {  
		Scanner sc = new Scanner(System.in);    
		float cm, m, km;  
		System.out.println("Enter length in Centemeter");
		cm = sc.nextInt();
			
			m = cm / 100;
                 	km= cm / 100000;

		System.out.println("Length in meter "+m);
		System.out.println("Length in Kilometer "+km);
    }}  