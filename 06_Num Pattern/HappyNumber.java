import java.util.Scanner;

class HappyNumber                      //do the sum of square of individual number until 
										//the number became single digit and thats equals to 1 then 
                                       // that num is Happy NUmber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int sqr =0;
		int sum =0;
		while(num>0||sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			 int rem = num%10;
			 //System.out.println(rem);
			 sqr = rem*rem;
			 num/=10;

			 sum+=sqr;

		}
		System.out.println(sum==1?"Happy Number ":"It is Not Happy Number");
		

	}
}
