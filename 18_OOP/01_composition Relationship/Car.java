class Car
{
	String brand;
	String model;
	Engine engine;

	Car(String brand,String model,Engine engine)
	{
		this.brand=brand;
		this.model=model;
		this.engine=engine;
	}
	public void displayCar()
	{
		System.out.println("Car Details");
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
	}
}	