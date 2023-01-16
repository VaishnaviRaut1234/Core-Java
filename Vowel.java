import java.util.Scanner;

class Vowel
{
	public static void main(String args[])
	{
		char ch='0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet");
		ch=sc.next().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Alphabet is vowel");
		}
	else
		{
			System.out.println("Alphabet is const");
		}
}
}