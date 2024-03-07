import java.util.Arrays;
class Series2
{
	public static void main(String[] args) {
		int num =18;
		int [] arr = new int[10];
		arr[0]=num;

		for (int i=1,even=2;i<arr.length ;i++,even+=2 ) {
			int pow =1;
			for (int j=1;j<=3 ;j++ ) {
				pow = pow *even;				
			}

			int nextNum = arr[i-1]+(pow-even);
			arr[i]=nextNum;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}