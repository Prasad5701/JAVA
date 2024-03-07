import java.util.Scanner;
class HappyNumber
{
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		square(num);

	}

	public static void square(int a)
	{
		if(a==0 || sum>9)
		{
         	System.out.println(sum);		
			
				a=sum;
				sum=0;
		}
		
		// else {
		// 	System.out.println(sum==1?"Happy Number":"Not Happy Number");
		// }
			
			
		
		int rem =a%10;
		int sqr= rem*rem;
		sum+=sqr;
		a/=10;

		square(a);


	}
}