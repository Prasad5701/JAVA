class Bag
{
	String brand;
	double price;
	int compartment;
	Books book;


	Bag(String brand,double price,int compartment)
	{
		this.brand=brand;
		this.price=price;
		this.compartment=compartment;
	}

	public void createBook()
	{
		 book =new Books(200,50.0,"classBook") ;
	}

	public void displayBag()
	{
		System.out.println("Bag Details");
		System.out.println("Brand : "+ this.brand);
		System.out.println("Price of Bag : "+this.price);
		System.out.println("compartment : " + this.compartment);
	}

}