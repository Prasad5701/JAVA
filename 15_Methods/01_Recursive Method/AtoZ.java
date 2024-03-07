class AtoZ
{
	static char ch ='A';

	public static void main(String[] args) {
		m1();
	}

	public static void m1()
	{
		if(ch=='Z'+1)
		{
			return;
		}
		System.out.println(ch++);
		m1();
	}
}