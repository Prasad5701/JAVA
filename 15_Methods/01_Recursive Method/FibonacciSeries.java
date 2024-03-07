class FibonacciSeries
{
	static int a =0;
	static int b =1;
	static int count =0;
	public static void main(String[] args) {
		String c = series();
		System.out.println(c);

	}

	public static String series()
	{
		if(count==10)
		{
			return null;
		}
		int op;
		op=a+b;
		System.out.println(op);
		a=b;
		b=op;
	    count ++ ;  
	    series();


	    return "Here is your series";
		

	}
}