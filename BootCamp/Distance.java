import java.util.*;
class Distance
{
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 Point");
		x1 = sc.nextInt();
		System.out.print("Enter x2 Point");
		x2 = sc.nextInt();
		System.out.print("Enter y1 Point");
		y1 = sc.nextInt();
		System.out.print("Enter y2 Point");
		y2 = sc.nextInt();

		distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1) *(y2-y1));
		System.out.println("Result is : " + distance);
	}
}