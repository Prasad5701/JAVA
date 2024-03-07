import java.util.Scanner;
class StrontioNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();  //1221

if(num>1000 && num <9999)
{
		int num2 = num *2;  //2442

		int temp = num2%1000;      //442
		//System.out.println(temp); 

		temp=temp/10;              //44
		//System.out.println(temp);


		int temp1 =temp/10;
		int temp2 = temp%10;

		if(temp1==temp2)
		{
			System.out.println("Strontio Number");
		}
		else
		{
			System.out.println("Not Strontio Number");
		}

}
else
{
	System.out.println("Enter Only 4 Digit Number");
}

	}
}