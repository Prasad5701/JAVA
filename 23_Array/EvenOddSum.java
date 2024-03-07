class EvenOddSum
{
	public static void main(String[] args) {
		
		byte [] arr = {1,2,3,4,5,6,7,8,9,23,54,12,35,127};

		int evenSum =0;
		int oddSum =0;

		// int i = 0;
		// while(i<arr.length)
		// {
		// 	int num = arr[i];

		// 	if(num%2==0)
		// 	{
		// 		evenSum+=num;
		// 	}
		// 	else 
		// 	{
		// 		oddSum+=num;
		// 	}
		// 	i++;
		// }
		// System.out.println("Even Sum Of Array is : "+evenSum);
		// System.out.println("Odd Sum of Array is : "+oddSum);

		for(int i : arr)
		{
			if(i%2==0)
			{
				evenSum+=i;
			}
			else 
			{
				oddSum+=i;
			}
		}
		System.out.println("Even Sum Of Array is : "+evenSum);
		System.out.println("Odd Sum of Array is : "+oddSum);


	}
}