class BagBookDriver
{
	public static void main(String[] args) {
		Bag bag= new Bag("SkyBag",1500,5);
		bag.displayBag();
		bag.createBook();
		bag.book.displayBooks();
	}
}