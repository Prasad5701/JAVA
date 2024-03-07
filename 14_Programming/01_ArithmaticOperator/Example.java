import java.util.Scanner;
class Example
{
	public static void main(String[] args) {
		// int num = 12345678;
		// int wnum = num%10;
		// System.out.println(wnum);
		// int tnum = num/100;
		// System.out.println(tnum);


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();




		int tnum = num; 
		int wnum =num;
		int count =0; 
		while(tnum>0)
		{
			int rem = tnum%10;
			count ++;
			tnum/=10;
		}

		int div=1;
		for(int i=1;i<count;i++)
		{
			div=div*10;
		}

		System.out.println("First Number is : "+wnum/div);
		System.out.println("last Number is : "+wnum%10);

		// int rev =0;
		// while(tnum>0)
		// {
		// 	int rem = tnum%10;
		// 	rev =rev*10+rem;
		// 	tnum/=10;
		// }
		// System.out.println(wnum%10);
		// System.out.println(rev%10);



	}
}