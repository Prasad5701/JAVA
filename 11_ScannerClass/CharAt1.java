import java.util.Scanner;

class CharAt1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = sc.next();
		System.out.print("Enter the index : ");
		byte indx = sc.nextByte();
		char ch = name.charAt(indx-1);
		System.out.println("character at "+ indx + " is " + ch);
	

	}

}