import java.util.Scanner;

class Equation 
{
	public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
		System.out.print("Enter the Value of a : ");
		int a = dc.nextInt();
		System.out.print("Enter the Value of b : ");
		int b = dc.nextInt();

		int result = (a+b)*(a+b);

		System.out.println("The Result of Equation is " + result);
	}
}