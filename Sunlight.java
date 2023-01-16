import java.util.Scanner;

public class Sunlight {
public static void main(String[] args) {
// Distance from sun (150 million kilometers)
int kmFromSun = 150000000;
int lightSpeed = 299792458; // meters per second
// Convert distance to meters.
int mFromSun = kmFromSun * 1000;
int seconds = mFromSun / lightSpeed;
System.out.print("Light will use ");
int min = seconds / 60;
seconds = seconds - (min*60);
System.out.print(min + " minute(s) and " + seconds + " second(s)");
System.out.println(" to travel from the sun to the earth.");
}
}
