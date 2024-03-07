import java.util.*;
import java.util.Collections;
class SortMethod
{
	public static void main(String[] args) {
		        
		List<Integer> ol = new ArrayList<>();
        ol.add(1);
        ol.add(2);
        ol.add(3);
        ol.add(4);
        ol.add(5);

        Collections.sort(ol);
        System.out.println("Sort : "+ol);

        Collections.reverse(ol);
        System.out.println("Reverse : "+ol);

        Collections.shuffle(ol);
        System.out.println("Shuffle : "+ ol);

        Collections.sort(ol);

        Collections.swap(ol,2,4);
        System.out.println("Swap : "+ol);

        Collections.min(ol);
        System.out.println("Min : "+ ol);

        Collections.max(ol);
        System.out.println("Max : "+ol);

        Collections.replaceAll(ol,4,10);
        System.out.println("Repplace : "+ol);

        Collections.fill(ol,)

	}
}