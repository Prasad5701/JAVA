class Car
{
	String brand;
	String model;
	Driver driver;

	Car(String brand,String model)
	{
		this.brand=brand;
		this.model=model;
	}

	void createDriver(String name,int age,String gender)
	{
		 driver = new Driver(name,age,gender);

	}

	public  void displayCar()
	{
		System.out.println(this.brand);
		System.out.println(this.model);
	}
}