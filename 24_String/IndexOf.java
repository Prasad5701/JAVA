import java.util.*;
class IndexOf
{
	static String abc = "ABCDEFGHIJKLMN";
	char [] ch1 = abc.toCharArray();
	public static void main(String[] args) {

		String name = "L";
		char [] ch = name.toCharArray();
		char ch2 = ch[0];

		
		IndexOf obj = new IndexOf();
		System.out.println(obj.indexOf(ch2));
		
	}
	public int indexOf(char name1)
	{
		int i;
		for( i =0;i<ch1.length;i++)
		{
			if(ch1[i]==name1)
			{
				System.out.println(i);
				break;
			}

		}
		return i;

	}
}