class MinThree
{
	public static void main(String[] args) {
		int a = 9;
		int b = 6;
		int c  =10;

		int min = a<b?(a<c?a:c):(c<b?c:b);

		System.out.println(min);
	}
}