import java.util.*;
class NumberAssesment
{
	public static void main(String[] args) {
		int[]arr = {25,10,20};

		int num =arr[0];
		int sum =0;
		for (int i=arr.length-1;i>0 ;i-- ) {
			sum+=arr[i];
			
		}
		//System.out.println(sum);
		int totalSum=sum+num;
		int lastSum =totalSum+sum;
		System.out.println(lastSum);
	}
}