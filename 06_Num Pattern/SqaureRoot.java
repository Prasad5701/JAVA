import java.util.Scanner;
class SqaureRoot
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		//int num =625;
		for(int i=1;i<=num/2;i++)
		{
			if(i*i==num)
			{
				System.out.println("The Sqaure root of number "+num+" is "+ i);
			}
		}

	}
}