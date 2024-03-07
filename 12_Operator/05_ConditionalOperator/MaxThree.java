class MaxThree
{
	public static void main(String[] args) {
		int a = 8;
		int b = 4;
		int c = 7;

		int max = a>b?(a>c?a:c):(c>b?c:b);

		System.out.print(max);
	}
}