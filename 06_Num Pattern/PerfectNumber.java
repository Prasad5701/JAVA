import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int sum =0;

		for (int i=1;i<num;i++ ) 
		{
			if(num%i==0)
			{
				// System.out.println(i);
				sum+=i;
			}
			
		}
		 //System.out.println(sum);

		if(sum==num)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}





	}
}