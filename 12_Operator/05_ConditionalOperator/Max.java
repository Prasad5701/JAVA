import java.util.Scanner;
class Max
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int a = sc.nextInt();
		System.out.print("Enter num2 : ");
		int b = sc.nextInt();

		int max = a>b?a:b;

		System.out.println("Max Number is " + max);
		
	}
}