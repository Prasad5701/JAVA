class Shelf
{
	String type;
	int capacity;


	Shelf(String type,int capacity)
	{
		this.type=type;
		this.capacity=capacity;
	}

	public void displayShelf()
	{
		System.out.println("****Shelf Details****");
		System.out.println("Type of shelf : "+this.type);
		System.out.println("Capacity of shelf : "+this.capacity);
		System.out.println();
	}
}