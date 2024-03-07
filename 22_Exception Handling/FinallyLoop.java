class FinallyExample
{
	public static void main(String[] args) {
		System.out.println("main Start");
		m1();
		System.out.println("main End");
	}
	public static void m1()
	{
		for(int i =1;i<=10;i++)
		{
			   try 
		      {
		      		System.out.println("try "+ i);
			      System.out.println(10/0);
		      }
		      catch(ArithmeticException ae)
		      {
		      	System.out.println("AE Handle");
		      	if(i==3)
		      	{
		      		break ;
		      	}
		      }
		      finally
		      {
			      System.out.println("Hello Finally");
		      }

		}
		
	}
}