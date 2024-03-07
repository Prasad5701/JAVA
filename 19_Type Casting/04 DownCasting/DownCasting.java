class Parent{}
class Child1 extends Parent{}
class Subchild1 extends Child1{}
class Subchild2 extends Child1{}
class Child2 extends Parent{}
class Subchild3 extends Child2{}
class Subchild4 extends Child2{}

class DownCastingDriver
{
	public static void main(String[] args) {
		Parent a = new Child1();
		Child1 b = (Child1)a;
		System.out.println(a);
		System.out.println(b);
	}
}

