import java.util.regex.*;
class Regex2
{
	public static void main(String[] args) {
		String a = "abc2cDb%e!a@AaB";
		// Pattern pt = Pattern.compile("[a-z]");
		// Pattern pt = Pattern.compile("[A-Z]");
		// Pattern pt = Pattern.compile("[a-zA-Z]");
		//Pattern pt = Pattern.compile("[0-9]");
		//Pattern pt = Pattern.compile("[a-zA-Z0-9]");
		Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
		Matcher mt = pt.matcher(a);
		while(mt.find())
		{
			System.out.println(mt.start() + "-" +mt.group());
		}
	}
}