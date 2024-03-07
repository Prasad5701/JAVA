class Os
{
	String kernal;
	String version;

	Os(String kernal,String version)
	{
		this.kernal = kernal;
		this.version = version;
	}
	public void kernalName()
	{
		System.out.println("Name of Kernal : "+this.kernal);
	}

	public void version()
	{
		System.out.println("Version for Linux : "+this.version);
	}

}
class Linux extends Os
{
	
	Linux(String version,String kernal)
	{
		super(kernal,version);	
	}
}
class Windows extends Os
{
	
	Windows(String version,String kernal)
	{
		super(kernal,version);	
	}

}
class MacOs extends Os
{
	
	MacOs(String version,String kernal)
	{
		super(kernal,version);
	}
	
}
class Driver
{
	public static void main(String[] args) {
		Linux l = new Linux("8.12" ,"Monolithic");
		l.kernalName();
		l.version();
		Windows w = new Windows("12.132","Windows NT");
		w.kernalName();
		w.version();
		MacOs m = new MacOs("15.234","XNU");
		m.kernalName();
		m.version();		
	}
}