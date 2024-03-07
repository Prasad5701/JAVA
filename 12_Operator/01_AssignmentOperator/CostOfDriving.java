import java.util.Scanner;
class CostofDriving 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Driving Distance in Miles: ");
		double distance = sc.nextDouble();

		System.out.print("Enter miles per gallon : ");
		double milesPerGallon = sc.nextDouble();

		System.out.print("Enter Price per gallon : ");
		double pricePerGallon = sc.nextDouble();


		double cost = (pricePerGallon/milesPerGallon) * distance;
		System.out.println("The Cost of driving is "+ cost);


	}
}