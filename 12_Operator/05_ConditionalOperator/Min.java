import java.util.Scanner;
class Min
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int a = sc.nextInt();
		System.out.print("Enter num2 : ");
		int b = sc.nextInt();

		int min = a<b?a:b;

		System.out.println("Min Number is " + min);
		
	}
}