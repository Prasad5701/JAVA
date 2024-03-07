import java.util.*;
class ConvertTwoOneArray
{
	public static void main(String[] args) {
		int [][] arr = {{10,20,30},{40,50,60,70}};
		int [] newArr = new int[arr[0].length+arr[1].length];
		//System.out.println(arr[0].length+arr[1].length);
		// System.out.println(Arrays.deepToString(arr));
	
		
		int indx=0;
		for (int[] num : arr ) {
			for (int  num1 : num ) {
				//System.out.println(num1);
					newArr[indx++]=num1;
				
			}
			
		}
			System.out.println(Arrays.toString(newArr));
	}
}