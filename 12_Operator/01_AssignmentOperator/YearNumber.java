import java.util.Scanner;

class YearNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of minutes : ");
		int min = sc.nextInt();

		int day = min/(60*24);

		int year = day/365;
		int days = day%365;

		System.out.println(min + " minutes is approximately "+year+" years and "+days+" days");

	}
}