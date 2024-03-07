class Animal
{
	public void walk()
	{
		System.out.println("Animal Walking");
	}
	public void sleep()
	{
		System.out.println("Animal Sleeping");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
	public void speed()
	{
		System.out.println("Speed of Dog");
	}
}
class InheritDriver
{
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		dog.sleep();
		dog.speed();
	}
}