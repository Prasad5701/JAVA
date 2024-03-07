import java.util.*;
class RemoveAllMethod
{
	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		for (int i=10;i<=100 ;i+=10 ) {
			a.add(i);
		}
		System.out.println(a);
		Collection b = new ArrayList();
		b.add(10);
		
		try{
			b.add(null);
		}
		catch(NullPointerException np)
		{
			System.out.println("Cant remove null Point");
		}
		a.removeAll(b);
		System.out.println(a);
	}
}