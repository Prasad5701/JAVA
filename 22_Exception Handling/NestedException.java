class NestedException
{
	public static void main(String[] args) {
		
		try 
		{
			System.out.println("Outer try");
			try 
			{
				System.out.println("inner try ");
				System.out.println(10/0);
			}
			finally
			{
				System.out.println("inner finally");
			}
		}
		catch (ArithmeticException ae)
		{
			System.out.println("AE Handle");

		}
		finally 
		{
			System.out.println("outer finally");
		}
	}
}