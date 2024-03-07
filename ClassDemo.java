import java.util.regex.*;
class ClassDemo
{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Ra@M#ESH!");
		System.out.println(sb);
		

		Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
		Matcher mt = pt.matcher(sb.toString());
		while(mt.find())
		{
			//System.out.println(mt.start() +"-"+mt.group());
			sb.delete(mt.start()-1,mt.start());
		}
		System.out.println(sb);
	}
}