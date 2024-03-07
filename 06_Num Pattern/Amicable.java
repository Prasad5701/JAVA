import java.util.Scanner;
class Amicable
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value a : ");
		int a =sc.nextInt();
		System.out.print("Enter value b : ");
		int b =sc.nextInt();

		int sum1 =0;
		
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				//System.out.println(i);
				sum1=sum1+i;				     //sum of factor of a
			}
		}
		System.out.println("sum of factor of a "+sum1);



		int sum2 =0;
		for(int i=1;i<b;i++)
		{
			if(b%i==0)
			{
				//System.out.println(i);
				sum2=sum2+i;			       //sum of factor of b	
			}
		}
		System.out.println("sum of factor of b "+sum2);


       //if sumofFactor of a=b and sumofFactor of b = a;



		if(sum1==b&&sum2==a)
		{
			System.out.println("Amicable Pair ");
		}
		else 
		{
			System.out.println("Not Amicable Pair");
		}





	}
}