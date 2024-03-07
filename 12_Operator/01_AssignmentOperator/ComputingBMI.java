import java.util.Scanner;

class ComputingBMI
{
	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter the Weight of body in Pound : ");
	 	double weight = sc.nextDouble();

	 	System.out.print("Enter the Height of Body in inches : ");
	 	double height = sc.nextDouble();

	 	double heightInMeter = height * 0.0254;
	 	double weightInKg    = weight * 0.45359237;

	 	double bmi = weightInKg/(heightInMeter*heightInMeter);
	 	System.out.println("The BMI of Body is "+ bmi);
	 }
}