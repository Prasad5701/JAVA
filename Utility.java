import java.util.Scanner;
class Utility
{
	
	public static void evenOdd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int num = sc.nextInt();

		if(num%2==0)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println(num);
		}
	}


	public static void reverse()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int num = sc.nextInt();

		int rev=0;
		for(int i=1;i<=num;i++)
		{
			int rem = num%10;
			rev = rev*10 +rem;
			num/=10;
		}
		System.out.println(rev);

	}


	public static void countDigit()
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int num = sc.nextInt();

		int count =0;
		while(num>0)
		{
			int rem = num%10;
			count++;
			num/=0;
		}
		System.out.println(count);
	}

	public static void primeNum();
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int num = sc.nextInt();

		int count =0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count ++;
				break;
			}
			
		}
		System.out.println(count==0?"Prime":"Not Prime");

	}




}
