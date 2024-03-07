import java.util.*;
class SecondMaxElement
{
	public static void main(String[] args) {
		int [] arr = {20,8,50,52,9,70,35,15,100};

		int largest =arr[0];
		int secondLargest=arr[1];
		int smallest=arr[0];
		for (int i=1;i<=arr.length-1;i++ ) {
			if(largest<arr[i])
			{
				largest =arr[i];
				for(int j=i+1;j<arr.length;j++){
					if (arr[i]<arr[j]) {

						secondLargest=arr[i];
					}
				}				
			}
			
			
		}
		System.out.println("Largest Element : "+largest);
		
		System.out.println("Second Largest Element : "+secondLargest);

		
	}
}