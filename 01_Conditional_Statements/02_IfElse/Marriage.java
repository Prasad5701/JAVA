import java.util.Scanner;
class Marriage{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Age of Boy : ");
		int age = sc.nextInt();
		System.out.print("Enter Property : ");
		int property = sc.nextInt();
		System.out.print("Enter a Surname : ");
		String surname = sc.next();

		if (age>=21 && property >10000000 && surname == "Ambani") {
			System.out.println(" The Boy can Marry to His girlFriends");
			
		}
		else{
			System.out.println("The Boy does not marry to his girlFriends");
		}
	}
}