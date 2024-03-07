import java.util.Scanner;
class NeonNumber    //9 => 81 => 8+1 = 9;
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int sqr = num*num;
		int sum = 0;
		while(sqr>0)
		{
			int rem = sqr%10;
			sum+=rem;
			sqr/=10;
		}
		if(sum==num)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
	}
}