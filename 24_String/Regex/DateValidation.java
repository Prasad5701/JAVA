import java.util.regex.*;
import java.util.*;

class DateValidation
{
	public static void main(String[] args) {
		
		String date = "31/03/2001";

		System.out.println(Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}",date));
		if(Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}",date))
		{
			String[]ele = date.split("/");
			if ((Integer.parseInt(ele[0])<=31)&&(Integer.parseInt(ele[0])>0)&&
				(Integer.parseInt(ele[1])<=12)&&(Integer.parseInt(ele[1])>0))
			 {

				System.out.println(date + " Correct Date");
				
			}
			else 
			{
			     System.out.println("Wrong date");
			}

		}
		else 
		{
			System.out.println("Wrong date");
		}
	}
}