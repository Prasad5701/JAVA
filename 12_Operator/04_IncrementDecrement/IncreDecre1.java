class IncreDecre1
{
	public static void main(String[] args) {
		int a = 1;
		int b= ++a;
		int c = b--;
		System.out.println(++a + a-- + --b + b++ + c-- +a+b+c);
	}
}