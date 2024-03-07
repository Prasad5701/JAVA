import java.util.Scanner;
class FactorsOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		factors(num);

	}
	static int i=1;
	public static void factors(int a)
	{
		if(i==a)
		{
			return;
		}

		if(a%i==0)
		{
			System.out.println(i);
		}
		i++;
		factors(a);
	}
}