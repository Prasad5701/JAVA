import java.util.Scanner;
class XylemNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
//1

		int temp = num;
		int lastNum=temp%10;
		//System.out.println(lastNum);

//2
		int rev =0;
		while(temp>0)
		{
			int rem = temp%10;
			rev =rev*10+rem;
			temp/=10;
		}
		int firstNum = rev%10;
		//System.out.println(firstNum);


//3


		int extream = lastNum + firstNum;
		//System.out.println(extream);


//4

		int temp1 =num;
		int count =0;
		while(temp1>0)
		{
			int rem = temp1%10;
			count ++;
			temp1/=10;
		}
		//System.out.println(count);

//5


		int temp2 = num;
		int sum =0;
		for(int i=1;i<(count-1);i++)
		{
				temp2/=10;
				int rem = temp2%10;
				sum+=rem;
		}
		//System.out.println(sum);

		System.out.println(sum==extream?"Xylem Number":"Phlorem Number or Not Xylem Number");
	}
}