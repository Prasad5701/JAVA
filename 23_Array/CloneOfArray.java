import java.util.Arrays;
class CloneOfArrays
{
	public static void main(String[] args) {
		char [] characters = {'a','e','i','o','u'};
		char [] dup = characters.clone();

		System.out.println(Arrays.toString(characters));
		System.out.println(Arrays.toString(dup));

		characters[0]='A';
		System.out.println();
		System.out.println(Arrays.toString(characters));
		System.out.println(Arrays.toString(dup));



 System.out.println();
 System.out.println();
 System.out.println();



		int [] arr1 ={10,20,30,40,50,60};
		int [] dupli = new int[arr1.length];

		for(int i=0;i<arr1.length;i++)
		{
			dupli[i]=arr1[i];

		}
		System.out.println(Arrays.toString(arr1));
	     	System.out.println(Arrays.toString(dupli));
	     	arr1[2]=10000;
	     	System.out.println(Arrays.toString(arr1));
	     	System.out.println(Arrays.toString(dupli));
	}
}