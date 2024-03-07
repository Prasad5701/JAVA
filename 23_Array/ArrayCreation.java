import java.util.*;
class ArrayCreation
{
	public static void main(String[] args) {

		byte[] a = new byte[2];


		short[][] b = new short[2][3];


		int[][] c = new int[2][];
		c[0]= new int[2];
		c[1]= new int[3];



		float[][][] d = new float[3][][];
		d[0] = new float[1][3];
		d[1] = new float[2][1];
		d[2] = new float[1][2];


		long[][][] e = new long[3][1][3];


		double[][][] h = new double[2][][];
		h[0] = new double[2][];
		h[0][0] = new double[1];
		h[0][1] = new double[3];
		h[1] = new double[3][1];


		// char[][][] f = new char[4][][];
		// f[0] = new char[1][4];
		// f[1] = new char[2][1];
		// f[2] = new char[1][3];
		// f[3] = new char[2][];
		// f[3][0] =  new char[1];
		// f[3][1] = new char[2];

		// f[0][0][0] = 'a';
		// f[0][0][1] = 'b';
		// f[0][0][2] = 'c';
		// f[0][0][3] = 'd';

		// f[1][0][0] = 'e';
		// f[1][1][0] = 'f';

		// f[2][0][0] = 'g';
		// f[2][0][1] = 'h';
		// f[2][0][2] = 'i';
		

		// f[3][0][0] = 'k';
		// f[3][1][0] = 'l';
		// f[3][1][1] = 'm';

		// char[][][] f = {{'a','b','c','d'}},{{'e'},{'f'}},{{'g','h','i'}},{{'j'},{'k','l'}}};

		char [][][] f = {{{'a','b','c','d'}},{{'e'},{'f'}},{{'g','h','i'}},{{'j'},{'k','l'}}};
 



		System.out.println(Arrays.deepToString(f));



		String[][][] g = new String[3][][];
		g[0] =  new String[1][3];
		g[1] = new String[2][1];	
		g[2] = new String[3][];
		g[2][0] = new String[1];
		g[2][1] = new String[2];
		g[2][2] = new String[3];



	}
}