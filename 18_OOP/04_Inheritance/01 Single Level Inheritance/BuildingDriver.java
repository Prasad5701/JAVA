class Building
{
	String location = "karve Nagar";
	int noOfGates = 3;
	boolean lift = true;
	String secretary = "Ramesh";
}
class Flat extends Building
{
	String type = "3BHK";
	double area = 1000;
	int door = 3;
	int windows = 5;
}

class BuildingDriver
{
	public static void main(String[] args) {
		
		Flat flat = new Flat();
		System.out.println(flat.location);
		System.out.println(flat.type);
		System.out.println(flat.windows);
		System.out.println(flat.lift);

	}
}