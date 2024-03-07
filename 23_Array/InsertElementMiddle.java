import java.util.*;
class InsertElementMiddle
{
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60,70,8 0,90};
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter Number of Element want to Store : ");
		int no = sc.nextInt();
		int [] newArr = new int[arr.length + no];
		System.out.print("At what index you want to Store : ");
		int indx = sc.nextInt();
		System.out.println(Arrays.toString(newArr));

		int newIndx =0;
		if(indx>=0 && indx<=arr.length)
		{
			for (int i=0;i<indx ;i++ ) {
				newArr[newIndx++]=arr[i];
			}
			for (int i=1;i<=no ;i++ ) {
				System.out.print("Enter "+i+" Element : ");
				newArr[newIndx++]=sc.nextInt();		
			}
			for (int i=indx;i<arr.length;i++ ) {
				newArr[newIndx++]=arr[i];
				
			}

		}
		else 
		{
			System.out.println("Index Not Found");
		}
		System.out.println(Arrays.toString(newArr));

	}
}