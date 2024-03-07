import java.util.Scanner;
class TempConversion
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c,f;
		System.out.println("1. Celcius to Fahrenheit :  \n  2.Fahrenheit to Celcius: ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1 :
			{
				System.out.print("Enter Celcius : ");
				c = sc.nextDouble();
				f = (c*9/5)+32;
				System.out.println("converted c to f "+f);
				break;

			}
		case 2 :
			{
				System.out.print("Enter Fahrenheit : ");
				f = sc.nextDouble();
				c = (f-32)*5/9;
				System.out.println("converted f to c "+c);
				break;

			}
		default: 
			{
				System.out.println("Wrong Choice selected");
			}
		}
	}
}