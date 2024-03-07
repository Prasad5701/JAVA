import java.util.Scanner;

class CalculateInterest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Balance In Account : ");
		double balance = sc.nextDouble();

		System.out.print("Enter a Annual Percentage Interest rate : ");
		double annualInterestRate = sc.nextDouble();

		double interest = balance* (annualInterestRate/1200);
		System.out.println("The interest for the next Month is "+interest);
	}
}