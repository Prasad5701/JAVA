import java.util.*;

class ScannerAddition
{

	public static void main(String[] args)
	{
		Scanner inpute = new Scanner(System.in);

		System.out.print("Enter the num1 : ");
		int num1 = inpute.nextInt();

		System.out.print("Enter the num2 : ");
		int num2 =  inpute.nextInt();

		int op = num1 + num2;

		System.out.println("Addition of Num1 and Num2 is "+ op);
	}
}