import java.util.*;
class SwapElement
{
	public static void main(String[] args) {
		int []arr ={10,20,30,40,50,60,70,80,90};
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Index 1 : ");
		int indx1 = sc.nextInt();
		System.out.print("Enter Index 2 : ");
		int indx2 = sc.nextInt();

		if ((indx1>=0&&indx1<=arr.length)&&(indx2>=0 &&indx2<=arr.length) ){

			int temp = arr[indx1];
			arr[indx1] = arr[indx2];
			arr[indx2] = temp;

			System.out.println(Arrays.toString(arr));
			
		}
		else 
		{
			System.out.println("Enter Wrong Index");
		}
	}
}