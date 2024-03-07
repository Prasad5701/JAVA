import java.util.Scanner;
class Seasons
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Month : ");
		String month = sc.next().toLowerCase();

		switch(month)
		{
		

		case "oct":
		case "nov":
		case "dec":
		case "Jan":System.out.println("Winter");break;

		case "feb" :
		case "march":
		case "april":
		case "may" : System.out.println("Summer");break;

		case "june" : 
		case "july" :
		case "aug"  :
		case "sept" : System.out.println("Rainy");break;
		default : System.out.println("Entered wrong Month");break;
		


		}
	}
}