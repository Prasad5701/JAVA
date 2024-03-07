import java.util.*;
class CountCharacter
{
	public static void main(String[] args) {
		char [] arr = {'a','d','m','i','t'};

		char temp = '0';

		for (int i=0;i<arr.length;i++ ) {
			for (int j=i+1;j<arr.length;j++ ) {

				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] =arr[j];
					arr[j]=temp;					
				}				
			}			
		}
		System.out.println(Arrays.toString(arr));


	    int count=arr[arr.length-2]-arr[1];
	    System.out.println("There are "+count+ " character in first index character and second last index character");


	}
}