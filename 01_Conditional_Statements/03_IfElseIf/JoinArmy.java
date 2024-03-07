import java.util.Scanner;
class JoinArmy
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		

		if (age>=18) {
			System.out.print("Enter Your Height(cm) : ");
			double height = sc.nextDouble();
			if (height>162) {
				System.out.print("Enter Your Weight(kg) : ");
				double weight = sc.nextDouble();
				if (weight>56) {
					System.out.println("You can join Army ");
				}
				else{
					System.out.println("Your Weight is not fit,You cannot Join Army ");
				}
			}
			else{
				System.out.println("Your height is not Normal,You cannot Join Army ");
			}
			
		}
		else{
			System.out.println("You cannot Join Army wait for "+(18-age)+" years");
		}
	}
}