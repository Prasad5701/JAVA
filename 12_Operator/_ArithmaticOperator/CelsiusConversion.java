import java.util.Scanner;

class CelsiusConversion
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Temperature in Celsius : ");
		double celsius = sc.nextDouble();

		double fahrenheit = (9.0/5) * celsius + 32;
		System.out.println(celsius +" celsius is "+ fahrenheit + " fahrenheit");
	}
}