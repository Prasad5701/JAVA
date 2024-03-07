import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int n=num;
		int n1=num;
		int sum=0;
		int prod=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n/=10;
		} 
		//System.out.println(sum);

		while(n1>0)
		{
			int rem=n1%10;
			prod=prod*rem;
			n1/=10;
		}
		//System.out.println(prod);

		System.out.println(sum==prod?"Spy Number":"Not a Spy Number");

		
	}
}