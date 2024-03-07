class CodePointCount
{
	public static void main(String[] args) {
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(a.codePointCount(0,a.length()));
		System.out.println(a.codePointCount(0,5));
		System.out.println(a.codePointCount(2,4));
		//System.out.println(a.codePointCount(2,1)); SIOBE

	}
}