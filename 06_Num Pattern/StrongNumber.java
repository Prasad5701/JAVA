import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int sum=0;
		int temp = num;
		while(temp>0)
		{
			int fact = 1;
			int rem = temp%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			//System.out.println(fact);

			sum=sum+fact;

			temp/=10;
		}
		System.out.println(sum==num?"Strong Number":"Not Strong Number");



	}
}