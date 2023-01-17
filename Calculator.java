import java.util.Scanner;

public class Calculator
{
	public static void main(String args[])
	{
		double a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number1");
		

		System.out.println("Enter a number2");

		a = sc.nextDouble();
		b = sc.nextDouble();

		System.out.println("Enter a Operator");
		double Result = 0;

		char op = sc.next().charAt(0);
		
		switch(op) {
				case '+' :
						Result = a + b;
						break;

				case '-' :
						Result = a - b;
						break;

				case '*' :
						Result = a * b;
						break;

				case '/' :
						Result = a / b;
						break;
				default :
						System.out.println("You enteres wrong input");
				}

		System.out.println(a + " " + op + " " + a+ " = " + Result);
		
}
}