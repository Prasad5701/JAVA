class Pillar
{
	int noOfPillars;
	double area;
	String shape;
	double loadOnPillar;
	//Pillar p = new Pillar(15,50,"Rectangle",47);


	Pillar(int noOfPillars,double area,String shape,double loadOnPillar)
	{
		this.noOfPillars = noOfPillars;
		this.area = area;
		this.shape = shape;
		this.loadOnPillar = loadOnPillar;
	}

	public void displayPillar()
	{
		System.out.println("Pillar Details");
		System.out.println("No of Pillar for Building : "+this.noOfPillars);
		System.out.println("Area od Pillar : "+ this.area + "sqft");
		System.out.println("Shape Of Pillar : "+ this.shape);
		System.out.println("Load On Pillar : "+this.loadOnPillar);
	}
}