import java.util.Scanner;
class PrimeNumber
{
	static int count =0;
	static int i =2;

	public static void main(String[] args) 
	{ 
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int a =sc.nextInt();
		isPrime(a);
		//2
		// int count =isPrime(a);
		// System.out.println(count==0?"Prime":"Not Prime");
	}

	public static void isPrime(int num)
	{
		if(i==num)
		{
			System.out.println(count>0?"Not Prime":"Prime");
			return;
		}

		if(num%i==0)
		{
			count ++;
		}
		i++;
		isPrime(num);

	}

//2
	// public static int* isPrime(int num)
	// {
	//	 int count=0;*
	// 	if(i==num)
	// 	{
	// 		return count;
	// 	}

	// 	if(num%i==0)
	// 	{
	// 		count ++;
	// 		return count;*
	// 	}
	// 	i++;
	// 	isPrime(num);
	// 	return count;*

	// }


}

	