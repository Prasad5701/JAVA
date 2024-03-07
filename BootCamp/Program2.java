import java.util.Scanner;
class Program2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int a = sc.nextInt();
		System.out.print("Enter b Value : ");
		int b = sc.nextInt();
		System.out.print("Enter c Value : ");
		int c = sc.nextInt();

		int res1 = a + b*c;
		int res2 = a*b + c;
		int res3 = c + a/b;
		int res4 = a %b + c;
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

	}
}