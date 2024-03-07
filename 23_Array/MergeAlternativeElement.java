import java.util.Arrays;
class MergeAlternativeElement
{
	public static void main(String[] args) {
		int [] a = {10,20,30,40};
		int [] b = {50,60,70,80,90,100};
		int [] newArr = new int[(a.length)+(b.length)];

		int indx =0;
		for (int i=0;i<b.length ;i++ ) {
			if(i<a.length){
			   newArr[indx ++] = a[i];
		    }
		    if(i<b.length)
		    {
			   newArr[indx ++] = b[i];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}