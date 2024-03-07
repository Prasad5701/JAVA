class Building
{
	int totalFlats;
	int gates;
	int watchmans;
	int family;
	String location;

	public void analyseBuilding()
	{
		System.out.println("**** Bulding Analyse ****");
		System.out.println("Location of Building : " + location);
		System.out.println("Total Flats in Builing : "+ totalFlats);
		System.out.println("Total Gates : "+gates);
		System.out.println("Total Watchman : "+watchmans);
		System.out.println("Total Families live in Building : "+ family);
	}
}

class BuildingDriver
{
	public static void main(String[] args) {
		Building b = new Building();
		b.location = "Pune";
		b.totalFlats= 64;
		b.family   = 47;
		b.gates = 3;
		b.watchmans = 5;

		b.analyseBuilding();
	}
}