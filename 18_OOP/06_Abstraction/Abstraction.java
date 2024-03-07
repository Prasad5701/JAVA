abstract class Parennt
{
	 abstract int m1();
	 abstract int m2();
}

abstract class Child1 extends Parennt
{
	public int m1()
	{
		System.out.println("Child m1()");

	}

}

class SubChild1 extends Child1
{
	public int m2()
	{
		System.out.println("Subchild m2()");
	}
}
abstract class SubChild2 extends Child1
{
	
}
class GrandChild1 extends SubChild2
{
	public int m2()
	{
		System.out.println("GrandChild1 m2()");
	}
}



class Child2 extends Parennt
{
	public int m1()
	{
		System.out.println("Child2 m1()");
	}
	public int m2()
	{
		System.out.println("Child2 m2()");
	}

}


abstract class Child3 extends Parennt
{

}
abstract class SubChild3 extends Child3
{

}
class GrandChild2 extends SubChild3
{
	public int m1()
	{
		System.out.println("GrandChild2 m1()");
	}
	public int m2()
	{
		System.out.println("GrandChild2 m2()");
	}
}


class AbstractDriver
{
	public static void main(String[] args) {
		
	}
}


