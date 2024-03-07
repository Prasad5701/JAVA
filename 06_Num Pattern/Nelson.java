import java.util.Scanner;
class Nelson
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();


		
			if(num/111==1)
			{
				System.out.println("Nelson Number");
			}
			else if(num/111==2)
			{
				System.out.println("Double Nelson Number");
			}
			else if(num/111==2)
			{
				System.out.println("Triple Nelson Number");
			}
		
	}
}