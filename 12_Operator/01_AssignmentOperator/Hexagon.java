import java.util.Scanner;

class Hexagon
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Side of Hexagon : ");
		double side = sc.nextFloat();

		double area = (3 *side*side* 0.866);              //root of 3 Divided by 2

		System.out.println("The Area of Hexagon is "+ area);
	}
}