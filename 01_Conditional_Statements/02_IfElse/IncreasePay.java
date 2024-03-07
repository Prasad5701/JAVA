import java.util.Scanner;
class IncreasePay
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Score : ");
		int score = sc.nextInt();
		System.out.print("Enter a Pay : ");
		double pay = sc.nextDouble();

		double increase;
		if (score>90) {

			increase= pay *0.03;
			System.out.println("Increase pay is "+increase);   
			
		}
		else{
			increase = pay *0.01;
			System.out.println("Increase Pay is "+ increase);
		}
	}
}