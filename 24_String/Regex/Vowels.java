import java.util.regex.*;
class Vowels
{
	public static void main(String[] args) {
		String a ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Pattern pt = Pattern.compile("[A E I O U]");
		Matcher mt = pt.matcher(a);
		while(mt.find())
		{
			System.out.print(mt.group());
		}
		System.out.println();

		Pattern pt1 = Pattern.compile("[^A E I O U]");
		Matcher mt1 = pt1.matcher(a);
		while(mt1.find())
		{
			System.out.print(mt1.group());
		}
	}
}