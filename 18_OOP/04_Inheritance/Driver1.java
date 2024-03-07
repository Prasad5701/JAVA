class Parent
{
	Parent()
	{
		System.out.println("parent cons");

	}
	String a = "parent class Variable";
}

class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("child cons");
	}
	String a = "Child Class Variable";
}

class Driver1
{
	public static void main(String[] args) 
	{
		Driver1 driver = new Driver1();
		driver.m2();
	}

	public void m2()
	{
		Child obj = new Child();
		System.out.println(obj.a);
		System.out.println(obj.a);


	}
}