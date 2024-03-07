class LibraryDriver
{
	public static void main(String[] args) {
		Book b = new Book("Hear Yourself","Me Myself","Historic","My Publication","English");
		Library library = new Library("Prasad","6:00","12:00",500,"Deccan",1234567896l,b);
		library.displayLibrary();

		library.book.displayBook();

		library.addShelf();
		library.shelf.displayShelf();

		library.addStudent();
		library.student.displayStudent();

		library.addLibrarian();
		library.librarian.displayLibrarian();

	

		
		
		
	}
}