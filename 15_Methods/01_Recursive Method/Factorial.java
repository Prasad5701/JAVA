class Factorial
{
	
	public static void main(String[] args) {
		factorial(6);

	}

	
	static int fact =1;
	public static void factorial(int num)
	{

		
		if(num==0)
		{
			System.out.println(fact);
			return;
		}
		fact = fact*num;  //5 20 60 120 120*1
		
		factorial(--num);  //num= 4 3 2 1 
		

	}
	
}