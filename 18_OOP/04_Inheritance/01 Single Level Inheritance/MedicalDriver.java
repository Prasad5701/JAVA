class Medical
{
	String type = "For Fever";

	

}
class Paracetamol extends Medical
{
	int power = 100;
	boolean available = false;

}
class MedicalDriver
{
	public static void main(String[] args) {
		Paracetamol p = new Paracetamol();
		System.out.println(p.power);
		System.out.println(p.available);
		System.out.println(p.type);
	}

}