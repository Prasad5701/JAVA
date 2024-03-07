class Parent
{
	Parent()
	{
		super();
		System.out.println("No argument constructor");
	}
}
class Child extends Parent
{
	Child()
	{
		this(10);
		System.out.println("No argument child constructoe");
	}
	Child(int a)
	{
		super();
		System.out.println("1 argumet child constructor");
	}
	public static void main(String[] args) {
		Child a = new Child();
	}
}