class PellSeries
{
	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		for(int i=1;i<10;i++)
		{
			int op = 2*b + a;
			System.out.print(op + "  ");
			 a=b; //1  
			 b=op;  //2 5
		}
	}
}