import java.util.Scanner;
class SunnyNumber      // if user enter a number and 
					   //(Number +1) having a perfect SqaureRoot then NUmber is
					   // Sunny Number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int sqrt =0;
		int num1= num +1;
		for(int i =1;i<=num1/2;i++)
		{
			if(i*i ==num1)
			{
				sqrt =i;
				break;
			}

		}
		if(sqrt>0)
		{
			System.out.println("Sunny Number");
		}
		else{
			System.out.println("Not Sunny Number");
		}
	}
}