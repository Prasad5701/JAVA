class Series
{

	public static void main(String[] args) {
	   
		
	   int a =5;
		for(int i=1; i<=5;i++)
		{
		    int div =1;
		    for(int j=1;j<=i;j++)
		    {
		        div =div*a;
		    }
		    int series = div/i;
		    
		    System.out.println(series);
		    
		}
		
	}
}