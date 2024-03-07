class StartRunMethod
{
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		t1.run();
		
	}
}

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Helooo "+Thread.currentThread().getName());
	}

}