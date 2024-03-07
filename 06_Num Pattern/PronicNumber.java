import java.util.Scanner;
class PronicNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number ");
		int num = sc.nextInt();

		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				//System.out.println(i);

				if(i*(i+1)==num)
				{
					System.out.println("PronicNumber");
				}
			
			}	
			
		}
	}
}