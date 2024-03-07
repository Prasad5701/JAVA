import java.util.Scanner;

class LottarySystem
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.print("Enter a Random Number : ");
		 int num = sc.nextInt();

		 int tnum = num;
		 final int wnum = 20;
		 int sum =0;
		 while(tnum>0)
		 {
             int rem = tnum%10;
             sum+=rem;
             tnum/=100;
             
		 }

		  if(sum==wnum)
             {
             	System.out.println("Congratulation You win the Lottary");
             }
             else
             {
             	System.out.println("Better Luck NextTime");
             }




	 	}
}