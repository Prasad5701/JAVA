import java.util.*;
class ArrayExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size Of Array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];

		for (int i =0;i<arr.length ;i++ ) {
			System.out.println("Enter the Data"+(i+1)+ " : ");
			int data = sc.nextInt();
			arr[i]=data;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}