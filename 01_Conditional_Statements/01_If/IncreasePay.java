import java.util.Scanner;

class IncreasePay
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Score : ");
		int score = sc.nextInt();

		double pay;
		pay = 3000;

		if (score>90) {
			pay = pay + pay*0.03;
			System.out.println("Total Pay :"+ pay);
			
		}
	}
}