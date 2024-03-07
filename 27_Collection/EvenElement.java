import java.util.*;
class EvenElement
{
	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> list = new ArrayList();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);

		Iterator it =list.iterator();
		while(it.hasNext())
		{
			Integer a = (Integer)it.next();
			if(a%2!=0)
			{
				it.remove();
			}
		}
		System.out.println(list);
		

	}
}