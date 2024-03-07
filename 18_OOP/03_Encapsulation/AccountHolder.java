class AccountHolder
{
	static int uniqueNumber = 342116;
	String name;
	String address;
	private long contactNumber;
	private long adharNumber;
	private String pancardNumber;
	private double balance;
	private int pin;
	int accountNumber;


	AccountHolder(String name,String address,long contactNumber,long adharNumber,String pancardNumber,
		           double balance,int pin)
	{
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.adharNumber = adharNumber;
		this.pancardNumber = pancardNumber;
		this.balance = balance;
		this.pin = pin ;
		this.accountNumber = uniqueNumber++;
		System.out.println("Account Created Sucessfully");
	}

	public String getName()
	{
		return this.name;
	}
	public void setName(String newName)
	{
		this.name = newName;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String newAddress)
	{
		this.address= newAddress;
	}
	public long getContact()
	{
		return this.contactNumber;
	}
	public void setContact(long newContact)
	{
		this.contactNumber = newContact;
	}
	public long getAdhar()
	{
		return this.adharNumber;
	}
	public String getPancard()
	{
		return this.pancardNumber;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(double newBalance)
	{
		this.balance = newBalance;
	}
	public int getPin()
	{
		return this.pin;
	}
	public void setPin(int newPin)
	{
		this.pin = newPin;
	}


}