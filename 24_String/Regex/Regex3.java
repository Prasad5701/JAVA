import java.util.regex.*;
class Regex2
{
	public static void main(String[] args) {
		String a = "abc2cDb%e!a@AaB";

		Pattern pt = Pattern.compile("[a-zA-Z0-9]");
		Matcher mt = pt.matcher(a);
		String newStr ="";
		while(mt.find())
		{
			newStr =newStr+mt.group();
		}
		System.out.println(newStr);
	}
}