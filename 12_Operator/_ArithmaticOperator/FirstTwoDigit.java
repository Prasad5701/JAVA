import  java.util.Scanner;

class FirstTwoDigit 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 Digit Number : ");
		int num = sc.nextInt();

		int firstTwoDigit = num /1000;

		System.out.println("The First Two Digit of " + num  + " is " + firstTwoDigit);

	}
}