import java.util.Scanner;

class CompoundValue
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Monthly saving amount: ");
		int amount = sc.nextInt();

		double monthInterest = 0.00417;
		double eachMonthInterest = 1 + monthInterest;   //as Given in the problem Statement
		
		double firstMonth = amount*(eachMonthInterest);
		double secondMonth = (amount + firstMonth) * eachMonthInterest;
		double thirdMonth = (amount + secondMonth)* eachMonthInterest;
		double fourthMonth = (amount + thirdMonth) * eachMonthInterest;
		double fivethMonth = (amount + fourthMonth)* eachMonthInterest;
		double sixthMonth = (amount + fivethMonth) * eachMonthInterest;

		System.out.println("After the Sixth Month,the amount Value is Rs- "+ sixthMonth);

	}
}