class Arithmatic
{
	public static void main(String[] args) {
		System.out.println(add(15,7));
		System.out.println(sub(15,7));
		System.out.println(div(15,7));
	}

	public static int add(int a ,int b)
	{
		int op = a+b;
		return op;
	}
	public static int sub(int a , int b)
	{
		int op = a-b;
		return op;
	}
	public static double div(int a,double b)
	{
		double op = a/b;
		return op;
	}
}