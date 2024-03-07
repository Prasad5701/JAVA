import java.util.Arrays;
// class ForEach
// {
// 	public static void main(String[] args) {
		
// 		String[][] arr = {{"a","b"},{"c"},{"d","e","f"}};

// 		char [][] a = {{'a','b','c'},{'d','e'},{'f'}};

// 		System.out.println(Arrays.toString(a));
// 		System.out.println(Arrays.deepToString(a));



// //for loop
// 		for (int i=0;i<arr.length;i++ ) {

// 			for (int j=0;j<arr[i].length;j++ ) {

// 				System.out.print(arr[i][j] +" ");	
// 			}
// 			System.out.println();
// 		}
// 		System.out.println("*******************");

// //while loop

// 		int i = 0;
// 		while(i<arr.length){

// 			int j =0;
// 			while(j<arr[i].length)
// 			{
// 				System.out.print(arr[i][j]+ " ");
// 				j++;
// 			}
// 			System.out.println();
// 			i++;
// 		}
// 		System.out.println("*******************");

// //do-While loop

// 		int h = 0;
// 		do{
// 			//System.out.println(arr[h]);
// 			int k =0;
// 			do{
// 				System.out.print(arr[h][k] + " ");
// 				k++;
// 			}while(k<arr[h].length);

// 			System.out.println();

// 			h++;
// 		}while(h<arr.length);
	
// 	System.out.println("*******************");
// 	System.out.println();
// 	System.out.println();


// //ForEach Loop
	// System.out.println();
	// System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	// System.out.println("For Each Loop");
	// System.out.println();
	// System.out.println();

	// for(String [] i:arr){

	// 	for(String j:i)
	// 	{
	// 		System.out.print(j + " ");
	// 	}
	// 	System.out.println();
	// }



// 1-D array


	// int [] a  = {2,3,4,5,6,7,8};

    //  int  i =0;
    //  do{
    //  	System.out.print(a[i] + " ");
    //  	i++;

    //  }while(i<a.length);


//     // for (int i :a ) {
//     // 	System.out.print(i+" ");
    	
//     // }
// }
	
// }





// 3-d Arrays

import java.util.Arrays;
class ForEach
{
	public static void main(String[] args) {

		String [][][] arr = {{{"a","b","c"},{"d","e"}},{{"f","g"},{"t"}},{{"s"},{"o","p","q"}}};

		// for(int i=0;i<arr.length;i++)
		// {
		// 	for(int j =0;j<arr[i].length;j++)
		// 	{
		// 		for(int k=0;k<arr[i][j].length;k++)
		// 		{
		// 			System.out.print(arr[i][j][k]+ " ");
		// 		}
		// 	}
		// }


		// for(String [][] i : arr)
		// {
		// 	for (String [] j: i) {
		// 		for (String k: j ) {
		// 			System.out.println(k);
					
		// 		}
				
		// 	}
		// }

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr));
	}
}