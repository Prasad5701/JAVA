import java.util.*;
class RotationArray
{
	public static void main(String[] args) {
		int []arr ={7,4,2,6,3,5};
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Index  : ");
		int indx = sc.nextInt();
		int []newArr =new int[arr.length];

		int newIndx =0;

		if(indx>0&&indx<=arr.length)
		{
			for (int i=indx;i<arr.length ;i++ ) {
				newArr[newIndx++]=arr[i];				
			}
			for (int i=0;i<indx ;i++ ) {
  				newArr[newIndx++]=arr[i];			
			}

			System.out.println(Arrays.toString(newArr));


		}
		else 
		{

		}
	}
}