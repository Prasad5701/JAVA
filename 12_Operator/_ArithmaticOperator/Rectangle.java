
import java.util.Scanner;
class Rectangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width of Rectangle : ");
		double width = sc.nextDouble();
		System.out.print("Enter the Height of Rectangle : ");
		double height = sc.nextDouble();

		double perimeter = 2*(width + height);
		double area = width * height;


		System.out.println("Width od Reactangle is " + width);
		System.out.println("Height of Reactangle is " + height);
		System.out.println("Perimeter of Rectangle is " + perimeter + " cm");
		System.out.println("Area of Rectangle is " + area + " cm2");
	}
}