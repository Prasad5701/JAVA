import java.util.*;
class Utility
{
	
	public static void evenOdd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int num = sc.nextInt();

		if(num%2==0)
		{
			System.out.println(num+" is Even");
		}
		else
		{
			System.out.println(num+ " is Odd");
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

	public static void primeNum()
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


	public static void gcd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter a num2 : ");
		int num2 = sc.nextInt();


		int gcd=1;
		
		for(int i=1;i<=num1&&i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				//System.out.println(i);
				gcd=i;
			}
		}
		System.out.println("Gcd is " +gcd);
	}


	public static void lcm()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter a num2 : ");
		int num2 = sc.nextInt();

		int lcm =(num1>num2)?num1:num2;
		//System.out.println(lcm);          //large value among two
		while(true)
		{
			if(lcm%num1==0 && lcm%num2==0)
			{
				System.out.print("lcm is " +lcm);
				break;
			}
			lcm++;
		}


		// int gcd=1;
		// for(int i=1;i<=num1&&i<=num2;i++)
		// {
		// 	if(num1%i==0 && num2%i==0)
		// 	{
		// 		//System.out.println(i);
		// 		gcd=i;
		// 	}
		// }

		// int lcm = (num1*num2)/gcd;
		// System.out.println("Lcm is " +lcm);

	}

//Factorial


}
