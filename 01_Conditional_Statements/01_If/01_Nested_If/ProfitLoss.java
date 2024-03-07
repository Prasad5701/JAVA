import java.util.Scanner;
class ProfitLoss
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the cost Price : " );
		int cp = sc.nextInt();
		System.out.print("Enter the Selling Price : ");
		int sp = sc.nextInt();

		if (sp>cp) {
			System.out.println("Seller Had Profit ");
			System.out.print("Profit is ");
			int p = (sp-cp);
			System.out.println(p);

		}
		else if (cp>sp) {
			System.out.println("Seller Got Loss ");
			System.out.print("The Loss is ");
			int l = +(cp-sp);
			System.out.println(l);
		}
		else{
			System.out.println("No Profit No Loss ");
		}
	}
}