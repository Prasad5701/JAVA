import java.util.*;
class InsertElement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {10,20,30,40};
		System.out.println("Enter the Size : ");
		int sz = sc.nextInt();
		int[] newArr = new int[arr.length + sz];

		int indx =0;

		for (int num :arr ) {
			newArr[indx++]=num;	
		}
		for(int i=1;i<=sz;i++)
		{
			System.out.println("Enter the "+i+" Element");
			newArr[indx++]=sc.nextInt();
		}
		System.out.println(Arrays.toString(newArr));
	}
}