import java.util.Scanner;

class AutobiographicalNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int n =num;
		int sum =0;

		int n1=num;
		int count =0;

		while(n1>0)
		{
			int rem=n1%10;
			count ++;
			n1/=10;
		}
		while(n>0)
		{
			int rem =n%10;
			sum+=rem;
			n/=10;
		}

		System.out.println(sum==count?"Autobiographical Number":"Not an Autobiographical Number");
	}
}