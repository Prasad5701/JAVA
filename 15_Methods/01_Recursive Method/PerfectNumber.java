import java.util.Scanner;
class PerfectNumber
{
	static int i=1;
	static int sum =0;
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
	    factors(num);		
	}

	public static void factors(int a)
	{
		
		if(i==a)
		{
			System.out.println("sum of factors is "+sum);
			System.out.println(sum==a?"Perfect Number":"Not Perfect Number");
			return;
		}
		
		if(a%i==0)
		{
			//System.out.print(i);
			sum+=i;
		}

		i++;
		factors(a);
	}
}




