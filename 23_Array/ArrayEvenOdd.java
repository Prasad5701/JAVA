import java.util.*;
class ArrayEvenOdd
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int evenCount =0;
		int oddCount =0;
		for (int num :arr) {
			if(num%2==0)
			{
				evenCount++;
			}
			if(num%2!=0)
			{
				oddCount++;
			}
			
		}
		// System.out.println(evenCount);
		// System.out.println(oddCount);

		int[]evenArray = new int[evenCount];
		int[]oddArray = new int[oddCount];
		int evenIndx=0;
		int oddIndx=0;
		for (int num :arr ) {
			if(num%2==0)
			{
				evenArray[evenIndx++]=num;
				
			}
			if(num%2!=0)
			{
				oddArray[oddIndx++]=num;
			}
			
		}
		System.out.println("Array : "+Arrays.toString(arr));
		System.out.println("Even Array : "+Arrays.toString(evenArray));
		System.out.println("ODD Array : "+Arrays.toString(oddArray));

	}
}