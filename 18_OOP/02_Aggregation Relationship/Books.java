class Books
{
	int noOfPages;
	double prices;
	String brand;


	Books(int noOfPages,double prices,String brand)
	{
		this.noOfPages=noOfPages;
		this.prices=prices;
		this.brand=brand;
	}

	public void displayBooks()
	{
		System.out.println("Book details");
		System.out.println("No of Pages : "+this.noOfPages);
		System.out.println("Price of Book :"+ this.prices);
		System.out.println("Brand of Book : "+this.brand);
	}

}