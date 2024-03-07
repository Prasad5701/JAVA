import java.util.Scanner;
class MagicNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();    //146

		int sum =0;
		      // true   false
		while(num>0 || sum>9)    
        {    //false     true

        	if(num==0)
        	{
        		num =sum;
        		sum =0;
        	}
		
			int rem = num%10;
			sum+=rem;
			num/=10;		     
			                      //at last num =0
		}
		System.out.println(sum);

		 System.out.println(sum==1?"Magic Number":"Not Magic Number");
	



		
	}
}