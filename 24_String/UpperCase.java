import java.util.*;
class UpperCase
{
	static String name = "PraSaD";
	public static void main(String[] args) {
		UpperCase ab = new UpperCase();
		System.out.println(ab.toUpperCase());
		
	}
	public String toUpperCase()
	{
	
	    char [] ch = name.toCharArray();
	    for (char c :ch ) {
	    	if(c>=97 && c<=127)
	    	{
	    		c= c-32;

	    	}
	    	else 
	    	{
	    		return c;
	    	}

	    	

	     System.out.println(String.valueOf(c));	
	    }
	    
	}
}