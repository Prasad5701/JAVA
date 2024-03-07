
import java.util.Scanner;
class LastDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Digit Number : ");
		int digit = sc.nextInt();

		int number = digit%10;


		System.out.println("LastDigit of Number " + digit + " is " + number);
	}
}