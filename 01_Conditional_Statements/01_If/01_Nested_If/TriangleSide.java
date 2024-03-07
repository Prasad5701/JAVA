import java.util.Scanner;
class TriangleSide
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three Sides of Triangle :");
		System.out.print("Enter Side 1 : ");
		int side1 = sc.nextInt();
		System.out.print("Enter Side 2 : ");
		int side2 = sc.nextInt();
		System.out.print("Enter Side 3 : ");
		int side3 = sc.nextInt();

		if ((side1+side2)>side3) {
			if ((side2+side3)>side1) {
				if ((side1+side3)>side2) {
					System.out.println("Triagle is valid with this Side");
				}
				else{
					System.out.println("Triangle is not Valid");
				}
			}
			else{
					System.out.println("Triangle is not Valid");
				}
		}
		else{
					System.out.println("Triangle is not Valid");
				}
	}
}