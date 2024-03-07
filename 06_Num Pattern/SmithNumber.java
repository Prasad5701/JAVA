import java.util.Scanner;
class SmithNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();     //85

		int sum =0;
		int temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		//System.out.println("The Sum of Digit is "+sum);      //8+5=13

		int dup =num;   //85
		int sum2 =0; 
		int sum1 =0;        
		for(int i=1;i<dup;i++)
		{
			if(dup%i==0)
			{
				 //System.out.println("The Factors are "+i);

				int isPrime=i;        // 1 5 17    factors
				//int count =0;
			
				
				for(int j=2;j<=isPrime;j++)
				{
					
					if(isPrime%j==0)
					{                                            

						//System.out.println("The Prime Factors are "+isPrime); //5 17

						while(isPrime>0)
						{	
							int rem =isPrime%10;
							sum1+=rem;
							isPrime/=10;

							                      // Not getting 5+1+7;
						}

						//System.out.println(sum1);    // 5 and 8(1+7)
				 	}

				} 				

			}

		}

		sum2=sum2+sum1;                 // 5+8
	    //System.out.println(sum2);     //13

	    System.out.println(sum==sum2?"Smith Number ": "Not Smith Number");


	}
}