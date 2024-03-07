class Computer
{
	String processor;
	String graphicCard;
	int ssd;
	int display;
	int ram;
	String sound;

	public void displayComputer()
	{
		System.out.println("*Computer*");
		System.out.println("Processor : "+ processor);
		System.out.println("Graphic Card : "+graphicCard );
		System.out.println("SSD : "+ssd + " gb");
		System.out.println("Display " + display + " Hz");
		System.out.println("Ram : "+ ram + " gb");
		System.out.println("Sound " + sound);
	}
}

class ComputerDriver
{
	public static void main(String[] args) {
		Computer c = new Computer(); //Default Cunstrux=ctor calling
		c.processor = "i7 Processor";
		c.ssd = 512;
		c.ram = 8 ;
		c.display = 144;
		c.graphicCard = "RTX 3600";
		c.sound = "Dolby";

		c.displayComputer();
	}
}