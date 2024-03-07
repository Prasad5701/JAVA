class Parent
{
	String a = "parent class Variable";	
	public static void main(String[] args) {
		
	}

}

class Child extends Parent
{
	String b = "Child Class Variable";

	// public void m1()
	// {
	// 	System.out.println(super.a);
	//     System.out.println(this.b);
	// }	
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
		//obj.m1();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}