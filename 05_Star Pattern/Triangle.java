class Triangle
{ 
	public static void main(String[] args)
	 {

		
		for (char i='a';i<='e' ;i++ ) 
		{
			for (char j='a';j<=i;j++ ) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}



System.out.println();



		for (int i=1;i<=5 ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print(j + " ");
			}System.out.println();
		}


System.out.println();

		
		for (int i=1;i<=5 ;i++ ) 
		{	
			for (int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
	 	    System.out.println();
		}

System.out.println();

		int count =1;
		for (int i=1;i<=5 ;i++ ) 
		{	
			for (int j=1;j<=i;j++) {
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}



System.out.println();



		char count1 ='a';
		for (char i='a';i<='e' ;i++ ) 
		{
			
			for (char j='a';j<=i;j++) {
				System.out.print(count1+ " ");
				count1++;
			}
			System.out.println();	
		}

System.out.println();


		int count2 =2;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count2+"  ");
				count2 += 2;		
			}
			System.out.println();
		}


System.out.println();


		int count3 =1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count3+"  ");	
				count3 +=2;			
			}
			System.out.println();
		}

System.out.println();




	}
}