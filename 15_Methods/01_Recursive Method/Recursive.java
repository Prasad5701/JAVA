class Recursive
{
	public static void main(String[] args) {
		m1();
	}

	public static void m1()
	{
		System.out.println("m1()");
		m2();
	}
	public static void m2()
	{
		System.out.println("m2()");
		m1();                                  //stact overflow
	}
}