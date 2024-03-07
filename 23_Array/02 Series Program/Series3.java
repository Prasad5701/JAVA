import java.util.*;
class Series3
{
	public static void main(String[] args) {
		int num =11;
		int [] arr = new int[10];
		arr[0]=num;

		for(int i=1;i<arr.length;i++)
		{
			int pow =1;
			for(int j=1;j<=i;j++)
			{
				pow =pow*i;				
			}

			arr[i]=num+(pow+i);
			num=arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
	}
}