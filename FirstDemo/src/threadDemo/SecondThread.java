package threadDemo;

public class SecondThread extends Thread
{
	public void run()
	{
		for(int x=10;x>=1;x--)
		{
			System.out.println("The value of x is "+x);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			

	}
	public static void main(String args[])
	{
		FirstThread fthread=new FirstThread();
		SecondThread sthread=new SecondThread();
		fthread.start();
		sthread.start();
	}

}
