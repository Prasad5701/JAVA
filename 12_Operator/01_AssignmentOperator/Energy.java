import java.util.Scanner;

class Energy
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of water in kg : ");
		double amountOfWater = sc.nextDouble();

		System.out.print("The Initial Temperature is ");
		double intialTemp = sc.nextDouble();

		System.out.print("The Final Temperature is ");
		double finalTemp = sc.nextDouble();

		double energy = amountOfWater *(finalTemp - intialTemp)*4184;

		System.out.println("The Energy Needed is "+energy);

	}
}