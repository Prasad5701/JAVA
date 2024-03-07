import java.util.*;
class AddMethod
{
	public static void main(String[] args) {
		Collection a = new ArrayList();
		for (int i=10;i<=100 ;i+=10 ) {

			a.add(i);
			
		}
		System.out.println(a);
		a.remove(50);
		System.out.println(a);
	}

}