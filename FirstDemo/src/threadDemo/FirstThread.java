package threadDemo;

public class FirstThread extends Thread {

public void run()
{
	for(int x=1;x<=10;x++)
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

}
