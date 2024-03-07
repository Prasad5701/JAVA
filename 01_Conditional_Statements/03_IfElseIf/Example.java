import java.util.Scanner;
class Example
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Marks : ");
		double marks = sc.nextDouble();

		if (marks>=75) {
			System.out.println("Distinction");	
		}
		else if (marks>=60) {
			System.out.println("FirstClass");
		}
		else if (marks>=50) {
			System.out.println("Second Class");
		}
		else if (marks>35) {
			System.out.println("Passed");
		}
		else if (marks==35) {
			System.out.println("Just Passed");
		}
		else{
			System.out.println("You have Failed the Exam");
		}
	}
}

