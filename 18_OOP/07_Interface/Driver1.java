interface Parent1
{
   default void m1()
   {
   	System.out.println("hi from parent1 m1()");
   }
}
interface Parent2
{
   default void m1()
   {
   	System.out.println("hi from parent2 m1()");
   }
}
interface Child extends Parent1,Parent2
{
		default void m1()
			{
				System.out.println("Hello from Child m1()");
				Parent1.super.m1();
				Parent2.super.m1();
			}
}
class Imp implements Child
{

}
class Driver1
{
	public static void main(String[] args) {
		System.out.println("Hello");
		Imp obj = new Imp();
		obj.m1();

	}
}
