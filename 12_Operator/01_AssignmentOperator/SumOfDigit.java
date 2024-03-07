import java.util.Scanner;

class SumOfDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Three Digit Number : ");      //126
		int num = sc.nextInt();                                    
		int op = 0;
		int rem = num%10;  //6
		op = rem;            //6    reinitialing
		num = num/10;        //12
		op = num%10 + op;      //8
		num = num/10;           //1
		op = num + op;          //9

		System.out.println("The Sum Of Digit is : "+op);


	}

}