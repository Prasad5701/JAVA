import java.util.Scanner;

class Acceleration 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Velocity : ");
		double v0 = sc.nextDouble();

		System.out.print("Enter the Ending Velocity : ");
		double v1 = sc.nextDouble();

		System.out.print("Enter the Time : ");
		double t = sc.nextDouble();

		double acceleration = (v1-v0)/t;
		System.out.println("The average Acceleration is "+ acceleration);
	}
}