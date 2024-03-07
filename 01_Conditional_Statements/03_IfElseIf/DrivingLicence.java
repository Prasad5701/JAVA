import java.util.Scanner;
class DrivingLicence
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Age : ");
		int age = sc.nextInt();

		if(age>=18){
			System.out.println("Your Are Eligible for Test ");
			System.out.print("Does you Given a RTO Test(T/F) : ");
			boolean test = sc.nextBoolean();
			if (test==true) {
				System.out.print("Enter Your Marks : ");
				double marks = sc.nextDouble();
				if (marks>=70) {
					System.out.println("You have Successfully Cleared RTO Test ");
					System.out.println("Wait for Driving Licence");
				}
				else{
					System.out.println("You have Not Cleared the RTO Test ");
					System.out.println("Please RE-Apply for RTO Test ");
				}
			}
			else{
				System.out.println("You doesnot Give test Please Apply for RTO test");
			}

		}
		else{
			System.out.println("Your Not Eligible for RTO Test Wait for "+(18-age)+" Years");
		}
	}
}