class PalimdromeNumber
{
	public static void main(String[] args) {
		int [] arr = {131,411,541,512,010,1221,5115,72127};

		for (int num :arr ) {

			int rev =0;
			int num1=num;
			for(;num1>0;num1/=10)
			{
				int rem = num1%10;
				rev = rev*10 +rem;
				num1/=10;
			}
			if(rev==num)
			{
				System.out.println(num);
			}
		}
	}
}