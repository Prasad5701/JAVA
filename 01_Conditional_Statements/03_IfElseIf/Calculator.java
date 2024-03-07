import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		double num1 = sc.nextDouble();
		System.out.print("Enter number 2 : ");
		double num2 = sc.nextDouble();
		System.out.print("Enter the Operator + - * / % ^  : ");
		char op = sc.next().charAt(0);
		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
		System.out.println("Operator = "+ op);
		System.out.print("Result : "+ num1 +op+ num2 + "=");

		if (op == '+') {
			System.out.println(num1 + num2);
		}
		else if (op == '-') {
			System.out.println(num1 - num2);
		}
		else if (op == '*') {
			System.out.println(num1 * num2);
		}
		else if (op == '/') {
			System.out.println(num1 / num2);
		}
		else if(op == '%'){
			System.out.println(num1%num2);
		}
		else if(op == '^'){
			for(int i=1; i<=num2; i++){
			 p *= num1;
		   } System.out.print(p);

		}
		else {
			System.out.println("Entered a Wrong Operator :");
		}
	}
}