import java.util.Scanner;

class VowelConsonent
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);

		String op = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"Vowel":"Consonent";
		System.out.println("The Enter Character '"+ ch + "' is a "+op);
	}
}