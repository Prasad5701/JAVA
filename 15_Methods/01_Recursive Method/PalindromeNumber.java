import java.util.Scanner;
class PalindromeNumber
{
	static int rev =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		isPalindrome(num);
		System.out.println(rev);
		System.out.println(rev==num?"Palindrome Number":"Not Palindrome Number");

		
	}
	public static String isPalindrome(int a)
	{
		if(a==0)
		{
			
			return "Execution Done";
		}
		int rem =a%10;
		rev = rev*10+rem;
		a/=10;
		
		isPalindrome(a);
		return "End of Program";

	}
}