import java.util.*;
class CodePointBefore
{
	public static void main(String[] args) {
		String a = "ABCDEfGHIJK";
		System.out.println(a.codePointBefore(2));
		System.out.println();

		char [] ch = a.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println();

		System.out.println(a.toLowerCase());
		System.out.println();

		System.out.println(a.toUpperCase());
		System.out.println();

		System.out.println(a.length());
	}
}