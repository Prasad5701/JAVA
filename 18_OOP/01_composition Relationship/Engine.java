class Engine
{
	int noOfPiston;
	double bhp;
	String engineType;

	Engine(int noOfPiston,double bhp,String engineType)
	{
		this.noOfPiston=noOfPiston;
		this.bhp=bhp;
		this.engineType=engineType;
	}
	public void displayEngine()
	{
		System.out.println("Enginee Detials");
		System.out.println("No of Piston : "+this.noOfPiston);
		System.out.println("brake horse power : "+this.bhp + " bhp");
		System.out.println("Engine Type : "+this.engineType);
	}
}