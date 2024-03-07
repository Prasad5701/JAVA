import java.util.*;
class Series4
{
	public static void main(String[] args) {
		
//1
		int num2 = 4;
		int [] arr2 = new int[10];
		arr2[0]=num2;
		int indx2 =1;

		for (int i=1;i<arr2.length-1;i++ ) {
			num2 = num2 + 6;
			arr2[indx2 ++] = num2;

		}
		//System.out.println(Arrays.toString(arr2));

//2


		int num1 = -5;
		int [] arr1 = new int[10];
		arr1[0] = num1;
		int indx1 =0;

		for (int num :arr2 ) {
			num1 = num1+num;
			arr1[indx1++] = num1;
				
		}
		//System.out.println(Arrays.toString(arr1));

//3


		int [] arr = new int[11];
		
		int numArr = 4;
		arr[0] = numArr;
		int indx = 1;
		int count =1;
		for (int num :arr1 ) {
			arr[indx ++] =num + numArr ;
			numArr = arr[count++];

			
		}
		System.out.println(Arrays.toString(arr));


		

	}
}