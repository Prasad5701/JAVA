class Book
{
	String name;
	String author;
	String type;
	String publication;
	String language;


	Book(String name,String author,String type,String publication,String language)
	{
		this.name= name;
		this.author=author;
		this.type=type;
		this.publication=publication;
		this.language=language;

	}

	public void displayBook()
	{
		System.out.println("****Book Details****");
		System.out.println("Name of Book : "+this.name);
		System.out.println("Author of Book : "+ this.author);
		System.out.println("Type of Book : "+this.type);
		System.out.println("Book publication : "+this.publication);
		System.out.println("language of Book : "+this.language);
		System.out.println();
	}
}