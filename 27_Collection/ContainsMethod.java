import java.util.*;
class ContainsMethod
{
	public static void main(String[] args) {
		
		Collection a  = new Treeset();
		for (int i=10;i<=100 ;i+=10 ) {
			
			a.add(i);
		}

		Collection b = new Treeset();
		b.add(10);
		b.add(50);
		b.add(70);
		b.add(100);
		
		System.out.println(a.containsAll(b));


		Collection c = new Treeset();
		c.add("150");
		c.add(null);
		System.out.println(c.containsAll(c));

	}
}