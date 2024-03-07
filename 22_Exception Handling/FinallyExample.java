class FinallyExample
{
	public static void main(String[] args) {
		System.out.println("main Start");
		m1();
		System.out.println("main End");
	}
	public static void m1()
	{
		try 
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Hello Finally");
		}
	}
}