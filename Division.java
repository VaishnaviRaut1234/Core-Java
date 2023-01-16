import java.util.Scanner;

class Division
{
   public static void main(String[] args)
   {
      int num1, num2;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number1: ");
      num1 = s.nextInt();

	System.out.print("Enter a Number2: ");
      num2 = s.nextInt();
      
      if(num1%num2==0)
	{
         System.out.println(num1+" is divisible by "+num2);
	}
      else
	{
         System.out.println(num1+" is not divisible by "+num2);
	}
   }
}