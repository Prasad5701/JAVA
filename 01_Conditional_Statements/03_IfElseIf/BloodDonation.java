import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Age : ");
		int age = sc.nextInt();
		System.out.print("Enter your Weight : ");
        int weight = sc.nextInt();
        
        if (age>=20) {
        	System.out.println("Your age is good for Blood Donation ");
        	System.out.print("Does you Consume Alcohol or Cigarette in Last 24 Hours(T/F) : ");
        	boolean alcohol = sc.nextBoolean();
        	

        	if(alcohol==true){
        		System.out.println("You cannot Donate Blood as You Consume Alcohol and Cigaratte in Last 24 Hour, ");
        		System.out.println("You can Donate blood After 24 Hours ");
        	}
        	else if (weight>=50) {
        		System.out.println("Good You doesnot Consume Alcohol or Cigaratte in last 24 hours, ");
        		System.out.println("your weight is Normal ");
        		System.out.println("You can Donate Blood ");
        	}
        	else if (weight<50) {
        		System.out.println("Your weight not Fit for Blood Donation, ");
        		System.out.println("You cannot Donate Blood ");
        	}
        	
        }
        else{
        	System.out.println("You cannot Donate Blood As You are Teenager, ");
        	System.out.println("You can Donate Blood after "+(20-age)+" Years");
        }

	}
}