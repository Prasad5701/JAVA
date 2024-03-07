import java.util.Scanner;

class ArmstrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt(); //153


		int temp1 = num;
		int temp2 = num;
		int count = 0;
		int sum = 0;
		while(temp1>0) //temp1 = 153
		{
			count++;
			temp1/=10;
		}
		System.out.println("Count is "+count);

		while(temp2>0) //temp2=153
		{
			int rem=temp2%10; //3  5  1
			int pow = 1;
			for(int i=1;i<=count;i++) //count=3
			{
				pow = pow*rem; //3*3*3  5*5*5  1*1*1

			}
			sum=sum+pow;  //0 + 27 + 125 + 1
			temp2/=10;  //15   1
		}
		System.out.println(sum==num?"Armstrong Number":"Not a Armstrong Number");




	}
}