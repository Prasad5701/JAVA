import java.util.Arrays;
class CloneOfTwoDArray

{
	public static void main(String[] args) {
		
		int [][] arr = {{100,200},{300,400,500}};
		int [][]dup = new int[arr.length][];
	

	for(int i=0;i<arr.length;i++)     //to specify the size of array
	{
		dup[i]=new int[(arr[i].length)];          
	}

	for(int i=0;i<arr.length;i++) //after specifing size we put the values
	{
		for (int j =0;j<arr[i].length;j++ ) {

			dup[i][j]=arr[i][j];
			
		}
	}

	System.out.println(Arrays.deepToString(arr));
	System.out.println(Arrays.deepToString(dup));

	}
}