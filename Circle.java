// Write a Java program to enter radius of a circle and find its diameter, circumference and area.

class Circle
 {  
   public static void main (String args[])  
    {      
		float radius, diameter, area, circumference, PI;  
			PI=3.14f;
                  radius=7;
			diameter = 2 * radius;
			circumference = 2 * PI * radius;
                 	area= PI * radius * radius;

		System.out.println("Diameter of circle is "+diameter);
		System.out.println("Circumference of circle is "+circumference);
            System.out.println("Area of circle is "+area);  
    }}  
