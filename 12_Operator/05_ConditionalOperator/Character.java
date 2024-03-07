import java.util.Scanner;

class Character
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch = sc.next().charAt(0);


        String op = ((ch>=65&&ch<=90)||(ch>=97&&ch<=122))?"It is Char":"it is Not Char";


        System.out.println(op);
	}
}