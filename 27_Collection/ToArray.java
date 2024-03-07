import java.util.*;
class ToArray
{
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		// System.out.println(l);;
		Object [] obj = l.toArray();
		System.out.println(Arrays.toString(obj));

		int [] arr = new int[l.size()];
		int indx=0;
		for (Object i : obj) {
			arr[indx++] = (int)i;
			// arr[indx++] = i.intValue();
		}
		System.out.println(Arrays.toString(arr));

	}
}