import java.util.Scanner;
class AngleOfTriangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Angles of Triangle ");

		int angle1 =sc.nextInt();
		int angle2 = sc.nextInt();
		int angle3 = sc.nextInt();

		if ((angle3+angle2+angle1)==180) {
			System.out.println("Triangle is Valid ");
		}
		else{
			System.out.println("Triangle is not valid");
		}
	}
}