import java.util.Scanner;

class ReverseNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Three Digit Number : ");    //425
		int num = sc.nextInt();
		int rev = 0;
		int rem = num%10;
		rev = rem;
		num = num/10;   //42
		rem = num%10;       //3
		rev = rev*10 + rem;  //52      /**/
		num = num/10;        //4
		rev = rev*10 + num;            /**/

		System.out.println("The Reverse of Number is " + rev);



	}
}