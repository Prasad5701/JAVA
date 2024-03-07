class Librarian
{
	String name;
	long contact;
	String address;
	String shift;
	String gender;

	Librarian(String name,long contact,String address,String shift,String gender)
	{
		this.name = name;
		this.gender =gender;
		this.contact=contact;
		this.address=address;
		this.shift=shift;
	}

	public void displayLibrarian()
	{
		System.out.println("****Librarian Details****");
		System.out.println("Name of Librarian : "+this.name);
		System.out.println("Gender : "+this.gender);
		System.out.println("Contact : "+this.contact);
		System.out.println("Address : "+this.address);
		System.out.println("Shift of Librarian : "+this.shift);
		System.out.println();
	}
}