class Driver
{
	String name;
	int age;
	String gender;

	Driver(String name, int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void displayDriver()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
	}
} 	