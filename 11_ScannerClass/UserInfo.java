import java.util.*;
class UserInfo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Username : ");
		String name = sc.nextLine();
		System.out.print("Enter Student NativePlace : ");
		String nativePlace = sc.next();
		System.out.print("Year of Passing : ");
		short yop = sc.nextShort();
		System.out.print("Branch of Student : ");
		String branch = sc.next();
		System.out.print("University of Student : ");
		String university = sc.next();
		System.out.print("CGPA : ");
		float cgpa = sc.nextFloat();
		System.out.print("Active Backlog : ");
		boolean backlog = sc.nextBoolean();

		
		System.out.println("Name is  " + name);
		System.out.println("Native Palce is  "+ nativePlace);
		System.out.println("Year of Passing is " + yop);
		System.out.println("Branch is "+branch);
		System.out.println("University is "+university);
		System.out.println("CGPA is "+cgpa);
		System.out.println("Do you have any Backlog "+backlog);
		
		
		
		
		
	}

}