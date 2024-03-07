import java.util.Scanner;

class CylinderVolume
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Radius and height of Cylinder : ");
		double radius = sc.nextDouble();
		double height = sc.nextDouble();

		double area = 3.14 * radius * radius;
		double volume = area * height;


		System.out.println("The Area of Cylinder is " + area);
		System.out.println("The volume of Cylinder is " +volume);



	}
}