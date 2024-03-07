import java.util.Scanner;
class EquilateralTriangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Three Sides of Triangle : ");
		System.out.print("Enter Side1 : ");
		int side1 = sc.nextInt();
		System.out.print("Enter Side2 : ");
		int side2 = sc.nextInt();
		System.out.print("Enter Side3 : ");
		int side3 = sc.nextInt();

		if ((side1 + side2)>side3) {
			if ((side2 + side3)>side1) {
				if ((side1 + side3)>side2) {
		
						if (side1==side2&&side2==side3) {
							System.out.println("The Triangle is Equilateral Triangle");
						}
						else if (side1==side2||side1==side3||side2==side3) {
							System.out.println("The Triangle is Isosceles Triangle ");
						}
						else{
							System.out.println("the Triangle is Scalene Triangle");
						}
				}	
							
				else{
					System.out.println("Not Possible Triangle");
				}
			}
			else{
				System.out.println("Not Possible Triangle");
			}
	}
	else{
		System.out.println("Not Possible Triangle");
		}




	}
}