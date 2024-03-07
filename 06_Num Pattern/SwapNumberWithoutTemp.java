class SwapNumberWithoutTemp
{
	public static void main(String[] args) 
	{
		
	
		int a = 9;
		int b = 7;

		a = a+b;   //a=9+7=16;
		b = a-b;   //b=16-7=9;
		a = a-b;   //a =16-9=7;


		System.out.println("a = "+a);
		System.out.println("b = "+b);

    }
}