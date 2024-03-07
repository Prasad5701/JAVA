import java.util.*;
class HighestSmallestElement
{
	public static void main(String[] args) {
		int [] arr = {50,80,30,20,90,10};

		int largest = arr[0];
		for (int i=1;i<arr.length;i++) {
		       if(largest<arr[i])
		       {
		       	  largest =arr[i];
		       }

		}
		System.out.println("Largest : "+largest);

		int smallest = arr[0];
		for (int i=1;i<arr.length;i++) {
		       if(smallest>arr[i])
		       {
		       	  smallest =arr[i];
		       }
		}
		System.out.println("Smallest : "+ smallest);

	}
}