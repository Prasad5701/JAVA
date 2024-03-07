class EndsWithEmp
{
	static String a;
	public static void main(String[] args) {

		a = "PRASAD";
		String end = "SAD";
		EndsWithEmp obj = new EndsWithEmp();
		System.out.println(obj.endsWith(end));
	}

	public boolean endsWith(String end)
	{
		boolean b =true;
		for(int i=a.length()-1;i>=0;i--)
		{
			if((a.charAt(a.length()-end.length())!= (srch.charAt(i)))
			{
				b = false;
				break;
			}
		}
		return b;

	}
}