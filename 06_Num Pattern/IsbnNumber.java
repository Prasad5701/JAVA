import java.util.Scanner;
class IsbnNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		long num = sc.nextLong();

		long value = 1;
		long sum =0;
		for(int i=1;i<=10;i++)
		{
			long rem = num%10;
			value = rem*i;
			sum+=value;
			num/=10;
			//System.out.println(value);

		}
		//System.out.println(sum);

		System.out.println(sum%11==0?"ISBN":"Not ISBN");

	}
}