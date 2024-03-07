import java.util.*;
class HashMapEx
{
	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(1,"Ramesh");
		map.put(2,"Sham");
		map.put(3,"Suresh");
		map.put(4,"Ramesh");
		map.put(5,"Suresh");
		map.put(6,"Ganesh");
		map.put(7,"Ram");
		map.put(8,"Ramesh");
		System.out.println(map);

		ArrayList<String> names = new ArrayList<String>();
		for(Entry<Integer,String> entry : map.entrySet())
		{
			nameas.add(entry.getValue());
		}
		Set<String>uniqueNames = new HashSet<String>(names);
		int fre = 0;iString maxReq="";
		for(String string : uniqueNames)
		{
			int currentFreq = Collections.frequency(names,string);
			if(frq<currentFreq)
			{
				frq=currentFreq;
				maxReq = string;
			}
		}
		System.out.println(maxReq+ "-");
		for(Entry<Integer,String>entry : map.entrySet())
		{
			if(maxReq.equals(entry.getValue()))
			{
				System.out.println(entry.getKey()+ " ");
			}
		}


		
	}
}