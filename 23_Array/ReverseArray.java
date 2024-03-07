import java.util.Arrays;
class ReverseArray
{
	public static void main(String[] args) {
		int [] a ={1,2,3,4,5,6,7,8,9};
		int [] rev = new int[a.length];

		for (int i=a.length-1,j=0;i>=0 ;i-- ) {
			rev[j++]=a[i];
		}
		System.out.println(Arrays.toString(rev));
	}
}