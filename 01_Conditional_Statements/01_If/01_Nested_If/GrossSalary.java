import java.util.Scanner;
class GrossSalary
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary : ");
		int bs = sc.nextInt();
		float hra,da ;


		if (bs<=10000) {
			hra = bs*0.2f;
			da  = bs*0.8f;
		}
		else if (bs<=20000) {
			hra = bs*0.25f;
			da  = bs*0.9f;
		}
		else{
			hra = bs*0.3f;
			da  = bs*0.95f;
		}
		System.out.println("Gross Salary = : "+(bs+hra+da));

	}
}