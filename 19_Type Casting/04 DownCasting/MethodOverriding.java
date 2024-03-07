class Parent1
{
	public void marriage()
	{
		System.out.println("Sushila");
	}
}
class Child extends Parent1
{
	public void marriage()
	{
		System.out.println("Shila");
	}
}
class MethodOverriding 
{
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.marriage();

		Parent1 obj1 = (Child)obj;
		obj1.marriage();

	}
}