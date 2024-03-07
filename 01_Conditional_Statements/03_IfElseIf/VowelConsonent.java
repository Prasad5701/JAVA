import java.util.Scanner;
class VowelConsonent
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);

		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("The Enter Character "+ch+" is LowerCase Vowel");
		} 
		else if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("UpperCase Vowel");
		}
		else{
			System.out.println("The Enter Character "+ch+" is Consonent");
		}
	}
}