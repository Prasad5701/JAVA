//Wajp to find Prime factor of A Number

import java.util.Scanner;
class PrimeFactor
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();  //20 => 
		
		for(int i =1;i<=num;i++)
		{	
		   if(num%i==0)
		   {
		   		//System.out.println(i);    Fact =>1 2 4 5 10 20  

		   		int fact =i;

		   		int count = 0;
		   		for(int j=2;j<fact;j++)
		   		{
		   			if(fact%j==0)
		   			{
		   				count++;
		   				break;
		   			}
		   		}
		   		if(count==0 && fact>1){
		   			System.out.println(fact + " ");
		   		}
		   }
		   
		}


		


	}
}