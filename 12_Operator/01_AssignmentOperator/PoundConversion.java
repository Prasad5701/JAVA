import java.util.Scanner;

class PoundConversion
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number in pound : ");
		double pound = sc.nextDouble();

		double kilogram = pound*0.454;
		System.out.println("The converted value is "+kilogram);

	}
}