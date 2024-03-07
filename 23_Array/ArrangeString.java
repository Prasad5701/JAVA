import java.util.*;
class ArrangeString
{
	public static void main(String[] args) {
		String temp ="";
		char temp1 = '0';
		String [] arr = {"prasad","tejas","aditya","ramesh","shantanu"};
		 ///////////////     2        5      1          3       4 
		//System.out.println(Arrays.toString(arr));
		char [] newArr = new char[arr.length];
		int indx =0;

		for (String String :arr ) {
			char a = String.charAt(0);
			newArr[indx ++] = a;
		}
		System.out.println(Arrays.toString(newArr));

		for (int i=0;i<arr.length;i++ ) {
			for (int j=i+1;j<arr.length;j++ ) {

				if (newArr[i]>newArr[j]) {
					temp1 = newArr[i];
					newArr[i] =newArr[j];
					newArr[j]=temp1;					
				}				
			}			
		}

		 System.out.println(Arrays.toString(newArr));
		 System.out.println();
		 System.out.println(Arrays.toString(arr));

		
		
		for (int i=0;i<arr.length;i++ ) {
			for (int j=i+1;j<arr.length;j++ ) {

				if (newArr[i]>newArr[j]) {
					temp = arr[i];
					arr[i] =arr[j];
					arr[j]=temp;					
				}				
			}			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
