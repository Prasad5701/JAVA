import java.util.Scanner;

class FirstVowelConsonent
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name : ");
		String str = sc.nextLine();

		char firstChar = str.charAt(0);
		System.out.println(firstChar);


		String result = (firstChar=='a'||firstChar=='e'||firstChar=='i'||firstChar=='o'||firstChar=='u')?"Vowel":"consonent";

	    System.out.println(result);
		
	}
}