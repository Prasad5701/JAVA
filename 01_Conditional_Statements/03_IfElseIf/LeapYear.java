import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year : ");
		int yr = sc.nextInt();

		if (yr%400==0 ||(yr%4==0&&yr%100!=0)) {
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not Leap Year");
		}
	}
}