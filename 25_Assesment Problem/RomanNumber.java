import java.util.*;
class RomanNumber
{
	public static void main(String[] args) {
		int [] numbers ={1,2,342,143,135,1000};
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(romanNum(numbers)));
	}

	public static String[] romanNum(int[]numbers)
	{
		String[] romanNumber = new String[numbers.length];
		int indx =0;
		String[]thousands ={" ","M"};
		String[]hundreds ={" ", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String [] tens ={" ","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] units ={" ","I","II","III","IV","V","VI","VII","VIII","IX"};

		for (int num :numbers ) {
			String roman =" ";
			roman = thousands[(num%10000 )/1000]+hundreds[(num%1000)/100]+tens[(num%100)/10]+units[(num%10)];
			romanNumber[indx++]=roman;
			
		}
		return romanNumber;

	}
}