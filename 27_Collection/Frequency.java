import java.util.*;
class Frequency
{
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(10,20,20,10,10,20,30,20,40,50);
		
		System.out.println(a);
		System.out.println(Collections.frequency(a,20));

		Set<Integer> b = new TreeSet(a);
		for (Integer i :b ) {
			System.out.println(i + "-"+Collections.frequency(a,i));
			
		}
	}
}