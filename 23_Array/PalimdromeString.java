class PalimdromeString
{
	public static void main(String[] args) {
		String [] names ={"ramesh","naman","suresh","nitin"};
		for (String name :names ) {

			if(isPalimdrome(name))
			{
				System.out.println(name);
			}
			
		}
	}

	public static boolean isPalimdrome(String name)
	{
		String rev = "";
		for (int i=name.length()-1; i>=0; i-- ) {

			rev = rev + name.charAt(i);
			
		}
		if(rev.equals(name))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}