import java.util.Scanner;

class UpperLower
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);

		String op =((ch>=65&&ch<=90)||(ch>=97&&ch<=122))?((ch>=65&&ch<=90)?"UpperCase":"LowerCase"):"It is not an Alphabet";

		System.out.println(op);
	}
}