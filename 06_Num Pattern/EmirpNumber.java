import java.util.Scanner;
class EmirpNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int n = num;
		int count = 0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
	   boolean prime1 = count==0?true:false;
	   System.out.println(prime1);

		int n1 =num;
		int rev=0;
		while(n1>0)
		{	
			int rem = n1%10;
			rev=rev*10 +rem;
			n1/=10;				
		}
// how to check both condition in single and gives third answeer
		int count1=0;
		for(int i=2;i<rev;i++)
		{
			if(rev%i==0)
			{
				count1 ++ ;
				break;
			}
		}
		boolean prime2 = count1==0?true:false;
		System.out.println(prime2);

		System.out.println((prime1==true && prime2 ==true)?"Emirp":"Not Emirp");


	}
}