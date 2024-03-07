import java.util.*;
class ListMethod
{
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		System.out.println(a);


		a.add(4,90);
		System.out.println(a);

		Collection b = new ArrayList();
		for (int i=20;i<=25 ;i++ ) {

			b.add(i);
			
		}
		a.addAll(2,b);
		System.out.println(a);


		a.remove(0);
		System.out.println(a);

		int value1=a.get(1);
		System.out.println(value1);

		a.set(0,555);
		System.out.println(a);

		int value = a.indexOf(50);
		System.out.println(value);

		int value3 = a.lastIndexOf("20,");
		System.out.println(value3);

		




	}
}