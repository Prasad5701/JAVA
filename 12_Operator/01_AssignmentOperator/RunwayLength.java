import java.util.Scanner;

class RunwayLength
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the velocity : ");
		double v = sc.nextDouble();

		System.out.print("Enter the Acceleration : ");
		double a = sc.nextDouble();

		double length = (v * v)/(2 * a);

		System.out.println("The Length of Runway is " + length); 
	}
}