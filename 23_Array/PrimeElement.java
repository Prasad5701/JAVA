class PrimeElement
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,13,15,16,17,18,19};


		// int count =0;
		// for (int num : arr) {
		
		// 	for(int i=2;i<=num;i++)
		// 	{
		// 		if(num%i==0)
		// 		{
		// 			count++;
		// 		}
		// 	}
		// 	if(count==0)
		// 	{
		// 		System.out.println(num);
		// 	}
			
		// }



		// System.out.println(isPrime(6));
		for (int num  :arr ) {
			int primeElement = isPrime(num);
			if(primeElement!=0)
			{
				System.out.print(primeElement + " ");
			}
			
		}
	
	}

	public static int isPrime(int num)
	{
		if(num<=1)
		{
			return 0;
		}
		int count =0;
		for (int i=2;i<num ;i++ ) {
			 if(num%i==0)
			 {
			 	count++;
			 }	
		}
		if(count==0)
		{
			return num;
		}
		return 0;

	 }
}