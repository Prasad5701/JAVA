class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String desc)
	{
		super(desc);
	}
}
class Bankfeatures
{
	private double bal;
	static Bankfeatures obj = new Bankfeatures();

	public double getBalance()
	{
		return this.bal;

	}
	public void setBalance(double nBal)
	{
		this.bal = nBal;
	}
	public void deposite(double damt)
	{
		this.bal = this.bal + damt;
		System.out.println("The Amount is deposited");
		System.out.println("The new amount is "+ this.getBalance());
	}
	public void withdraw(double wamt)
	{
		if(this.getBalance()>=wamt)
		{
			System.out.println("The amount is Withdraw ");
			System.out.println("And Remaining amount is "+this.getBalance());

		}
		else 
		{
			try 
			{
				throw new InsufficientBalanceException("Sorry you have in sufficient balnce");
			}
			catch(InsufficientBalanceException ife)
			{
				System.out.println(ife);
			}
		}

	}

	public static void main(String[] args) {
		obj.deposite(10000);
		obj.withdraw(5000);
	}

}
