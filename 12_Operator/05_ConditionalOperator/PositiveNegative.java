import java.util.Scanner;

class PositiveNegative
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		String op = (num>0||num<0)?(num>0?"Positive Number":"Negative Number"):(num==0?"Neutal Number":"Not a Number");



		System.out.println(op);
	}
}