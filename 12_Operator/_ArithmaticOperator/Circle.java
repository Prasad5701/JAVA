import java.util.*;
class Circle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		System.out.print("Enter the Radius : ");
		double radius = sc.nextDouble();
		double perimeter = 2 * pi * radius;
		double area = pi * radius * radius;

		System.out.println("Radius of Circle is " + radius + "cm");
		System.out.println("Perimeter of Circle is " + perimeter + "cm");
		System.out.println("Area of Circle is " + area + "cm2");

	}
}