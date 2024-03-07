public class AccessModifier
{
	public static void main(String[] args) {
		int a =1;
		int b=2;
		
		System.out.println(add(a,b));


	}

	protected static int add(int a,int b)
	{
		int op = a+b;
		return op;


	}
}