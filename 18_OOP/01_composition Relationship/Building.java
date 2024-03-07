class Building
{
	int floors;
	int flats;
	double area;
	Pillar pillar;


	Building(int floors,int flats,double area,Pillar piller)
	{
		this.floors = floors;
		this.flats = flats;
		this.area = area;
		this.pillar = pillar;
	}

	public void displayBuilding()
	{
		System.out.println("Building Details");
		System.out.println("No Of Floors : "+ floors);
		System.out.println("No of Flats : "+ flats);
		System.out.println("Area of Building : "+area);
		
	}
}