import java.util.*;
class DuplicateElement
{
	public static void main(String[] args) {
		int [] arr = {9,1,2,3,3,4,5,5,6,7,8,2,7,9,14,4,1};
		int [] newArr = new int[20];
		int indx =0;
		int unique ;
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
			     if (arr[i]==arr[j]) 
			     {
			   	     System.out.println(arr[i]);
				 }
		    }
		}
    }
}