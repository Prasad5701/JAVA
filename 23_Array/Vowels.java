import java.util.*;
class Vowels
{
	public static void main(String[] args) {

		
		String a = "shantanu";

		char [] arr = new char[3];
		int indx =0;

		for (int i=0;i<a.length();i++ ) 
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				//System.out.println(a.charAt(i));

				arr[indx ++] = a.charAt(i);


			}	
		}
		System.out.println(Arrays.toString(arr));

	}
}