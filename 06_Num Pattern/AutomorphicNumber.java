import java.util.Scanner;
class AutomorphicNumber    //if Square of number get Same Number in sqaure at last Position
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		int temp = num;
		int sqr = num * num ;
		int count = 0;
		int div = 1;
		

		while(temp>0)
		{
			count++;
			temp/=10;
		}

		for(int i=1;i<=count;i++)
		{
			div = div*10;
		}
		System.out.println(num==(sqr%div)?"Automorphic":"Not Automorphic");

		// if(num==sqr%div)
		// {
		// 	System.out.println("Automorphic");
		// }
		// else{
		// 	System.out.println("Not automorphic");
		// }
	}
}