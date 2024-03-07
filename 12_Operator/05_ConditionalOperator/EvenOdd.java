import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();

		String op = num%2==0?"Even":"Odd";

		System.out.println("The number is "+op);
	
	}
}