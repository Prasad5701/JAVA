import java.util.Scanner;

class PositiveNegativeOnly
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		String op = (num>0||num<0)?((num>0)?"Positive":"Negative"):"Not a Number";



		System.out.println(op);
	}
}