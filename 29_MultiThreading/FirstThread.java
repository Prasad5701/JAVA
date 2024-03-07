import java.util.*;
public class FirstThread
{
	public static void main(String[] args) {

		NewThread t1 = new NewThread();
		t1.start();
		for (int i=0;i<=10 ;i++ ) {
			System.out.println(Thread.currentThread().getName()+ " - "+i);
		}
	}
}

class NewThread extends Thread
{
	@Override
	public void run()
	{
		Thread.currentThread().setName("Prasad");
		for (int i=0;i<=10 ;i++ ) {
			System.out.println(Thread.currentThread().getName()+ " - "+i);
		}
	}
}