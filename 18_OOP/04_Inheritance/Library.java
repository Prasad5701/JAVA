class Library
{
	String name;
	String startTime;
	String endTime;
	double fees;
	String address;
	long contact;
	Book book;
	Librarian librarian;
	Student student;
	Shelf shelf;


	Library(String name,String startTime,String endTime,double fees,String address,long contact,Book book)
	{
		this.name=name;
		this.startTime=startTime;
		this.endTime=endTime;
		this.fees=fees;
		this.address=address;
		this.contact=contact;
		this.book = book;
	}

	public void displayLibrary()
	{
		System.out.println("*****Library Details*****");
		System.out.println("Name of Library : "+this.name);
		System.out.println("Time of Library : "+this.startTime +"am -"+this.endTime + "pm");
		System.out.println("Fees of library : "+this.fees + "rs");
		System.out.println("Address of Library : "+this.address);
		System.out.println("Contact Number of Library : "+ this.contact);
		System.out.println();
	}

	public void addShelf()
	{
		 shelf = new Shelf("Historic",150);
	}

	public void addStudent()
	{
	     student = new Student("Prasad","Male",1231242442l,"karveNagar","Computer");
	}
	public void addLibrarian()
	{
		 librarian = new Librarian("Tejas",12345567894l,"Kothrud","Day","male");
	}



}