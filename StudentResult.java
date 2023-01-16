import java.util.Scanner;

class Voting
{
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age=");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible for vote.");
		if (age>=65)
		{
			System.out.println("Your vote is privilege for us. You can use senior citizen facility");
		}
        }
        else
        {
            System.out.println("You are not eligible for vote.");
        }
    }
}