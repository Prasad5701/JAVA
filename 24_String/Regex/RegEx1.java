import java.util.regex.*;
class RegEx1
{
	public static void main(String[] args) {
		String a ="Ramesh is an Engineer.And ramesh has completed his Btech.and Ramesh Lives in Pune";
		String srch = "ramesh";
		Pattern pattern = Pattern.compile(srch);
		Matcher matcher = pattern.matcher(a.toLowerCase());
		int count =0;
		while (matcher.find())
		{
			count ++;

		}
		System.out.println(count);
		System.out.println(matcher.start());

	}
}