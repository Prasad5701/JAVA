import java.util.Scanner;
class PositiveNegative
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();


		if(num>0){
			System.out.println("Positive");
		}
		else if (num==0) {
			System.out.println("Zero");
		}
		else if (num<0) {
			System.out.println("Negative");
		}
	}
}