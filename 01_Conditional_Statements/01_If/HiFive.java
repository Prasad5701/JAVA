import java.util.Scanner;
class HiFive
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		if (num%5==0) {
			System.out.println("HiFive!");
		}
		if (num%2==0) {
			System.out.println("HiEven");
		}
	}
}