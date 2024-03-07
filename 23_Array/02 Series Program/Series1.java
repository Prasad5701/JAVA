import java.util.*;
class Series1
{
	public static void main(String[] args) {
		int [] arr = new int[10];
		int num1 =24;
		arr[0]=num1;

		for (int i =1;i<10 ;i++ ) {
			arr[i]=(num1*2)-(8*i);
			num1=arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
	}
}