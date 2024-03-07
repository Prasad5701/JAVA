// creating an 1 dimention array using new keyword without specifing its length

class ArmstrongElement
{
	public static void main(String[] args) {

		isArmstrong(new int[]{153,371,123,454,753});	
	}

	public static void isArmstrong(int [] numbers)
	{
		for (int number :numbers ) {

			int temp1 = number;
			int temp2 = number;
			int sum = 0;
			int count =0;

			while(temp1!=0)
			{
				count++;
				temp1/=10;
			}

			while(temp2!=0)
			{
				int rem = temp2%10;
				int pow =1;
				for(int i=1;i<=count;i++)
				{
					pow = pow*rem;
				}
			   sum+=pow;
			   temp2/=10;

			}
			if(sum==number)
			{
				System.out.println(number);
			}




			
		}
	}
}