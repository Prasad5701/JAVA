class CellPhone
{
	String brand;
	String type;
	double price;
	double screenSize;
	String model;
	int camera;
	int ram;
	int rom;
	
		public void displayPhone()
		{
			System.out.println("*** Cell Phone Info ***");
			System.out.println("Brand : " + brand);
			System.out.println("Type : " + type);
			System.out.println("Price : "+ price + " rs.");
			System.out.println("ScreenSize : "+screenSize+" inches");
			System.out.println("Model : "+ model);
			System.out.println("Camera : "+camera);
			System.out.println("Ram : "+ram + " gb");
			System.out.println("Rom : "+rom + " gb");
		}	
}
class CellPhoneDriver
{
	public static void main(String[] args) {
		CellPhone a = new CellPhone();
		a.brand = "Samsung";
		a.type = "SmartPhone";
		a.price = 120000;
		a.screenSize = 6.5;
		a.model = "S23 ultra";
		a.camera = 200;
		a.ram = 12;
		a.rom = 1024;

		a.displayPhone();
	}
}