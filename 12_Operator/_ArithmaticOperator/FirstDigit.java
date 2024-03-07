import java.util.Scanner;
class FirstDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Three Digit Number : ");
		int number = sc.nextInt();

		int result = number/100;

		System.out.println("The FirstDigit OF "+ number + " is "+ result);


	}
}