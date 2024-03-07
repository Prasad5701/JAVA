import java.util.*;
class EqualsIgnorCase
{
	static String name = "pRAsad";
	public static void main(String[] args) {
		EqualsIgnorCase eic = new EqualsIgnorCase();
		System.out.println(eic.equalsIgnorCase("PrasAD"));
		

	}
	public boolean equalsIgnorCase(String names)
	{


       boolean ab =(name.toUpperCase()).equals(names.toUpperCase());
       return ab;


	}
}