import java.util.Scanner;

class MeterConversion
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for feet : ");
		double feet = sc.nextDouble();

		double meter = feet * 0.305;

		System.out.println("The Conversion Value of Feet is "+ meter);
	}
}