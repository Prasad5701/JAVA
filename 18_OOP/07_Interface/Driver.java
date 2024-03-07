interface ArithmaticOperator
{
	int add(int a,int b);
	int sub(int a ,int b);
	int multi(int a,int b);
	int div(int a ,int b);
	int modulus(int a ,int b);

	// int sqaure(int num);
}
class Implemention implements ArithmaticOperator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a ,int b)
	{
		return a-b;
	}
	public int multi(int a,int b)
	{
		return a*b;
	}
	public int div(int a ,int b)
	{
		return a/b;
	}
	public int modulus(int a ,int b)
	{
		return a%b;
	}

	public int sqaure(int num)
	{
		return num*num;
	}
}
class Driver
{
	public static void main(String[] args) {
		
		Implemention imple = new Implemention();
		// System.out.println(imple.add(5,10));
		// System.out.println(imple.sub(10,5));
		// System.out.println(imple.multi(5,4));
		// System.out.println(imple.div(20,4));
		// System.out.println(imple.div(20,4));

		System.out.println(imple.sqaure(5));
	}
}