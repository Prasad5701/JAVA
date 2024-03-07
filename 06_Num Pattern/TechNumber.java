import java.util.Scanner;
class TechNumber              //TechPrime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int temp = num;
		int count =0;
		while(temp>0)
		{
			int rem = temp%10;
			count++;
			temp/=10;
		}
		//System.out.println("Count of Digit is "+count);

		int temp1=num;

		if(count%2==0)                //only even digit Number
		{
			int div=1;
			for(int i=1;i<=count/2;i++)
			{
				div =div*10;
			}
			  //System.out.println(div);    //number of 0 EX1- 2025 we need 100 to
			                                // divide this number and get first half and second half 
											// EX2- for 234567 we need 1000 as divider to find FirstHalf and Second Half


			int firstHalf = temp1/100;
			int secondHalf = temp1%100;
			// System.out.println("firsthalf is "+firstHalf);
			// System.out.println("secondHalf is "+secondHalf);


			int sum = firstHalf + secondHalf;
			//System.out.println("Sum of FirstHalf and SecoondHalf is "+sum);

			int sqr = sum*sum;
			//System.out.println("The Square of sum is "+sqr);


			if(sqr==num)
			{
				System.out.println(num + " is Tech Number");
			}
			else 
			{
				System.out.println(num + " is Not Tech Number");
			}
		}

		else 
		{
			System.out.println("Enter Even Digit Number ");
		}

		
	}
}