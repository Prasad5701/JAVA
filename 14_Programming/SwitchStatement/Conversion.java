import java.util.Scanner;
class Conversion
{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("********************");
			System.out.println();
			System.out.println("1. Conversion INR to Dollar ");
			System.out.println("2. Conversion Dollar to INR ");
			System.out.println("3. Conversion INR to Yen ");
			System.out.println("4. Conversion Yen to INR ");
			System.out.println("5. Conversion INR to Dirham ");
			System.out.println("6. Conversion Dirham to INR ");
			System.out.println("7. Conversion INR to Won ");
			System.out.println("8. Conversion Won to INR ");
			System.out.println();
			System.out.println("*********************");
			System.out.print("Enter a Your Choice  : ");
			int c = sc.nextInt();

			switch(c)
			{
			case 1 :
				System.out.println("Ok You Want to Convert INR To Dollor");
				System.out.print("Enter INR Value : ");
				double r1 = sc.nextDouble();
				double d1 = r1/77;
				System.out.println("The conversion from INR to Dollor is "+d1);
			break;
				
			case 2 :
				System.out.println("Ok You Want to Convert Dollor To INR");
				System.out.print("Enter Dollor   : ");
				double d2 = sc.nextDouble();
				double r2 = d2*77;
				System.out.println("The Conversion from Dollor to INR " + r2);
			break;


			case 3 :
				System.out.println("Ok You Want to Convert INR To Yen");
				System.out.print("Enter the INR Value : ");
				double r3 = sc.nextDouble();
				double y1 = r3/1.80;
				System.out.println("The Conversion From INR to Yen is " + y1);
			break;


			case 4 :
				System.out.println("Ok You Want to Convert Yen To INR");
				System.out.print("Enter the Yen : ");
				double y2 = sc.nextDouble();
				double r4 = y2*1.80;
				System.out.println("The Conversion From Yen to INR is "+ r4);
			break;



			case 5 :
				System.out.println("Ok You Want to Convert INR To Dirham");
				System.out.print("Enter the INR Value : ");
				double r5 = sc.nextDouble();
				double dh1 = r5/0.044;
				System.out.println("The Conversion is From INR to Dirham is " + dh1);
				break;

			case 6 :
				System.out.println("Ok You Want to Convert Dirham to INR");
				System.out.print("Enter the Dirham : ");
				double dh2 = sc.nextDouble();
				double r6 = dh2*0.044;
				System.out.println("The Conversion From Dirham to INR is "+r6);
			break;

			case 7 :
				System.out.println("Ok You Want to Convert INR To Won");
				System.out.print("Enter INR Value : ");
				double r7 = sc.nextDouble();
				double w1 = r7/15.73 ;
				System.out.println("The conversion from INR to Won is "+ w1);
			break;

			case 8 :
				System.out.println("Ok You Want to Convert Won To INR");
				System.out.print("Enter the Won : ");
				double w2 = sc.nextDouble();
				double r8 = w2*15.73;
				System.out.println("The Conversion From Won to INR is "+r8);
			break;




			default :
				System.out.println("Entered Wrong Choice");


			}
			
		}	
}