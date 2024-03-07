import java.util.Scanner;
class KaprekarNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();  //45

		int sqr = num*num;   //2025

		int count =0;
		int temp =sqr;
		while(temp>0)
		{
			count ++;
			temp/=10;
		}
		System.out.println("Square of Number : "+sqr);  //2025
		System.out.println("Count of Sqaure : "+count);  //4


		if(count%2==0)
		{
			int div = 1;
			for(int i=1;i<=count/2;i++)
			{
				div=div*10;
			}
			System.out.println("The divisor is : "+div);  //100

			int firstHalf = sqr/div;   //20
			int secondHalf = sqr%div;   //25

			System.out.println("First Half of Square : "+firstHalf);
			System.out.println("Second Half of Square : "+secondHalf);


			int sum = firstHalf + secondHalf;     //45
			System.out.println("The Sum is : "+ sum);

			if(sum==num)
			{
				System.out.println("Kaprekar Number");
			}
			else 
			{
				System.out.println("Not Kaprekar NUmber");
			}

		}
		else 
		{
			System.out.println("Not having Even Number of Digit which cannot be Divided into two equal Parts");
		}
	}
}