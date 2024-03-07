// write a java program to take two input from user to perform addition


import java.util.*;
class Addition
{

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 = sc.nextInt();
		int result = num1 + num2;

		System.out.println("The Addition of "+ num1 +" and " + num2 +" is "+ result);

	}
}