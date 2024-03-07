import java.util.Scanner;

class Tipscalculation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Subtotal : ");
		double subTotal = sc.nextInt();

		System.out.print("Enter the Tip Rate : ");
		double gratuityRate = sc.nextInt();

		double gratuity = subTotal * (gratuityRate/100);
		double total  = subTotal + gratuity;

		System.out.println("The gratuity is "+ gratuity +" and total is "+total);


	}
}