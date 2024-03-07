class Method1
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		ramesh(5);
		System.out.println("Main End");
	}
	public static void ramesh(int num)
	{
		System.out.println("Ramesh Start");
		System.out.println(num + " from main");
		int b =suresh();
		System.out.println(b + " from suresh");
		//System.out.println(suresh() + " from suresh");   method can be stored or Print
		System.out.println("Ramesh End");

	}
	public static int suresh()
	{
		System.out.println("Suresh Start");
		int b = 20;
		return b;
	}
}