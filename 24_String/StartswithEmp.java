import java.util.*;
class StartswithEmp
{
	static String a;
	public static void main(String[] args) {
		a="RAMESH";
		String srch = "RAM";
		StartswithEmp obj = new StartswithEmp();
		System.out.println(obj.startswith(srch));
		
	}
	public boolean startswith(String srch)
	{
		boolean b =true;
		for(int i=0;i<srch.length();i++)
		{
			if(a.charAt(i) != srch.charAt(i))
			{
				b =false;
				break;
			}
		}
		return b;

	}
}