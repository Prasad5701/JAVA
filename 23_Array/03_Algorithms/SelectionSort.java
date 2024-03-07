import java.util.*;
class SelectionSort
{
	public static void main(String[] args) {
		int [] a ={7,2,6,27,83,8,3,7,4,32,21,1};
		System.out.println(Arrays.toString(a));
		int temp =0;
		int pos =0;
		for (int i=0;i<a.length-1;i++ ) {
			pos =i;
			for (int j=i+1;j<a.length ;j++ ) {
				if(a[pos]>a[j])
				{
					pos =j;

				}
			}
				temp =a[pos];
				a[pos] =a[i];
				a[i]=temp;			
			
		}
		System.out.println(Arrays.toString(a));
	
	}
}