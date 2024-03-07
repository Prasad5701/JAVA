import java.util.Scanner;
class AssignValue
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of Y : ");
		int y = sc.nextInt();

		int x;
		if (y>0) {
			x=1;
			System.out.println("Assign value to x is "+x);		
		}

	}
}