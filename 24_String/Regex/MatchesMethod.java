import java.util.regex.*;
class MatchesMethod
{
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[6-9]{1}[0-9]{9}","9876543212"));
	}
}