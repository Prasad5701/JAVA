public class Arithmatic
{
	public static void main(String[] args) {

	
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		Thread1 thread1 = new Thread1(num1,num2);
		thread1.start();

		Thread2 thread2 = new Thread2(num1,num2);
		thread2.start();

		Thread3 thread3 = new Thread3(num1,num2);
		thread3.start();

		Thread4 thread4 = new Thread4(num1,num2);
		thread4.start();

		Thread5 thread5 = new Thread5(num1,num2);
		thread5.start();
	}
}

class Thread1 extends Thread
{
	int num1 ;
	int num2;
	Thread1(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void run()
	{
		System.out.println("Add - "+ (this.num1+this.num2));
	}
}

class Thread2 extends Thread
{
	int num1 ;
	int num2;
	Thread2(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void run()
	{
		System.out.println("Sub - "+ (this.num1-this.num2));
	}
}

class Thread3 extends Thread
{
	int num1 ;
	int num2;
	Thread3(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void run()
	{
		System.out.println("Multi - "+ (this.num1*this.num2));
	}
}

class Thread4 extends Thread
{
	int num1 ;
	int num2;
	Thread4(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void run()
	{
		System.out.println("div - "+ (this.num1/this.num2));
	}
}

class Thread5 extends Thread
{
	int num1 ;
	int num2;
	Thread5(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void run()
	{
		System.out.println("mod - "+ (this.num1%this.num2));
	}
}