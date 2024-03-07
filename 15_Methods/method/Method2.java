class Method2
{
	public static void main(String[] args) 
	{
		 String op =m1("Ramesh",9.3,false);
		 System.out.println(op);
	}

	public static String m1(String name,double cgpa, boolean bcklog)
	{
		System.out.println("my name is " + name);
		System.out.println("cgpa is " + cgpa);
		System.out.println("backlog " + bcklog);
		return "Good Evening";	
	}
}