class EvenNumberSeries
{
	static int i =1;

	public static void main(String[] args) {
		String c=evenOdd();
		System.out.println(c);
		
	}

	public static String evenOdd()
	{
		if(i==101)
		{
			return "Series End";
		}
		if(i%2==0)
		{
			System.out.print(i + " ");
			
		}
		
		i++;

		evenOdd();

		return " : Even Numbers Between 1 to 100";
	
	}
}