import java.util.*;
class ReverseTwoOneArray
{
	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40,50},{60}};
		int[] newArr = new int[arr[0].length+arr[1].length+arr[2].length];
		int [] rev = new int[newArr.length];

		int indx =0;

		for (int [] num :arr ) {
			for (int num1 :num ) {
				newArr[indx++]=num1;
				int revIndx =0;
				for (int i=(newArr.length-1);i>=0 ;i-- ) {
					rev[revIndx ++]=newArr[i];
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(rev));

	}
}